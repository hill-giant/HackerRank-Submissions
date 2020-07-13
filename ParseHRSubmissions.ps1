param(
    [String]$Path
)

<# 
   A script for parsing passing submissions from exported HackerRank data.   

   TODO: Figure out how to accomplish this with Bash + jq.
#>

$ErrorActionPreference = "Stop"

$data = Get-Content $Path | ConvertFrom-Json

$languages = $data.submissions.language |
                  Select-Object -Unique |
                  Where-Object {
                      $_ -ne '["html", "js", "css"]'
                  }

foreach ($language in $languages)
{
    switch ($language)
    {
        { $language -match "python"     } { $extension = "py" ; break }
        { $language -match "javascript" } { $extension = "js" ; break }
        { $language -match "bash"       } { $extension = "sh" ; break }
        { $language -match "csharp"     } { $extension = "cs" ; break }
        { $language -match "fortran"    } { $extension = "f"  ; break }
        default { $extension = $language -replace "\d" ; break }
    }

    if (-not (Test-Path ".\$language\"))
    {
        New-Item ".\$language" -ItemType Directory
    }

    $submissions = $data.submissions | Where-Object { $_.Score -eq 1.0 -and $_.language -eq $language }
    foreach ($submission in $submissions)
    {
        $challenge = $submission.challenge -replace "\W"
        $code = $submission.code
        Set-Content ".\$language\$challenge.$extension" $code -Force
    }
}