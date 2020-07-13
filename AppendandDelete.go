package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the appendAndDelete function below.
func appendAndDelete(s string, t string, k int32) string {
    sRunes := []rune(s)
    tRunes := []rune(t)

    if int32(len(s) + len(t)) <= k || s == t {
        return "Yes"
    }
    i := 0
    for i < len(sRunes) && i < len(tRunes) && sRunes[i] == tRunes[i] {
        i++
    }
    ops := int32(len(sRunes[i:]) + len(tRunes[i:]))
    if ops == k {
        return "Yes"
    }
    for j := i; j > 0; j-- {
        if int32(2*(i-j)) + ops == k {
            return "Yes"
        }
    }
    return "No"
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 1024 * 1024)

    s := readLine(reader)

    t := readLine(reader)

    kTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    k := int32(kTemp)

    result := appendAndDelete(s, t, k)

    fmt.Fprintf(writer, "%s\n", result)

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}

package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the appendAndDelete function below.
func appendAndDelete(s string, t string, k int32) string {
    sRunes := []rune(s)
    tRunes := []rune(t)

    if int32(len(s) + len(t)) <= k {
        return "Yes"
    }
    i := 0
    for i < len(sRunes) && i < len(tRunes) && sRunes[i] == tRunes[i] {
        i++
    }
    ops := int32(len(sRunes[i:]) + len(tRunes[i:]))
    if ops == k {
        return "Yes"
    }
    for j := i; j > 0; j-- {
        if int32(2*(i-j)) + ops == k {
            return "Yes"
        }
    }
    return "No"
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 1024 * 1024)

    s := readLine(reader)

    t := readLine(reader)

    kTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    k := int32(kTemp)

    result := appendAndDelete(s, t, k)

    fmt.Fprintf(writer, "%s\n", result)

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}

package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the appendAndDelete function below.
func appendAndDelete(s string, t string, k int32) string {
    sRunes := []rune(s)
    tRunes := []rune(t)

    if int32(len(s) + len(t)) <= k {
        return "Yes"
    }
    i := 0
    for i < len(sRunes) && i < len(tRunes) && sRunes[i] == tRunes[i] {
        i++
    }
    ops := int32(len(sRunes[i:]) + len(tRunes[i:]))
    for j := i; j > 0; j-- {
        if int32(2*(i-j)) + ops == k {
            return "Yes"
        }
    }
    return "No"
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 1024 * 1024)

    s := readLine(reader)

    t := readLine(reader)

    kTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    k := int32(kTemp)

    result := appendAndDelete(s, t, k)

    fmt.Fprintf(writer, "%s\n", result)

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}

package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the appendAndDelete function below.
func appendAndDelete(s string, t string, k int32) string {
    if int32(len(s) + len(t)) <= k {
        return "Yes"
    }
    i := 0
    for i < len(s) && i < len(t) && s[i] == t[i] {
        i++
    }
    ops := int32(len(s[i:]) + len(t[i:]))
    for j := i; j > 0; j-- {
        if int32(2*(i-j)) + ops == k {
            return "Yes"
        }
    }
    return "No"
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 1024 * 1024)

    s := readLine(reader)

    t := readLine(reader)

    kTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    k := int32(kTemp)

    result := appendAndDelete(s, t, k)

    fmt.Fprintf(writer, "%s\n", result)

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}

package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the appendAndDelete function below.
func appendAndDelete(s string, t string, k int32) string {
    if int32(len(s) + len(t)) <= k {
        return "Yes"
    }
    i := 0
    for i < len(s) && i < len(t) && s[i] == t[i] {
        i++
    }
    ops := int32(len(s[i:]) + len(t[i:]))
    for j := i; j > 0; j-- {
        if int32(2*(i-j)) + ops == k {
            return "Yes"
        }
    }
    return "No"
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 1024 * 1024)

    s := readLine(reader)

    t := readLine(reader)

    kTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    k := int32(kTemp)

    result := appendAndDelete(s, t, k)

    fmt.Fprintf(writer, "%s\n", result)

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}

