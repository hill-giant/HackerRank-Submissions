package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the cutTheSticks function below.
func cutTheSticks(arr []int32) []int32 {
    s := make(map[int32]int32)
    var max int32 = 0
    n := int32(len(arr))
    for _, v := range arr {
        if v > max { max = v }
        s[v]++
    }
    arr = nil
    for max > 0 {
        var min int32 = 0
        arr = append(arr,n)
        for i := int32(0); min == 0 && i <= max; i++ {
            if s[i] > 0 {
                min = i
                n -= s[min]
                s[min] = 0
            }
        }
        for j := min + 1; j <= max; j++ {
            s[j-min] = s[j]
        }
        max -= min
    }
    return arr
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 1024 * 1024)

    nTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    n := int32(nTemp)

    arrTemp := strings.Split(readLine(reader), " ")

    var arr []int32

    for i := 0; i < int(n); i++ {
        arrItemTemp, err := strconv.ParseInt(arrTemp[i], 10, 64)
        checkError(err)
        arrItem := int32(arrItemTemp)
        arr = append(arr, arrItem)
    }

    result := cutTheSticks(arr)

    for i, resultItem := range result {
        fmt.Fprintf(writer, "%d", resultItem)

        if i != len(result) - 1 {
            fmt.Fprintf(writer, "\n")
        }
    }

    fmt.Fprintf(writer, "\n")

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

