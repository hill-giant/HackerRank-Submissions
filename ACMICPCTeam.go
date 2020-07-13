package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
    "math/big"
)

// Complete the acmTeam function below.
func acmTeam(topic []string) []int32 {
    max := int32(0)
    n := int32(1)
    for i := range topic {
        for j := i + 1; j < len(topic); j++ {
            var a big.Int
            var b big.Int
            var r big.Int
            if _,ok := a.SetString(topic[i],2); !ok {
                panic("damn")
            }
            if _,ok := b.SetString(topic[j],2); !ok {
                panic("damn")
            }
            t := int32(len(strings.ReplaceAll(r.Or(&a,&b).Text(2),"0","")))
            if (t > max) {
                max = t
                n = 1
            } else if t == max {
                n++
            }
        }
    }
    return []int32{max,n}
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 1024 * 1024)

    nm := strings.Split(readLine(reader), " ")

    nTemp, err := strconv.ParseInt(nm[0], 10, 64)
    checkError(err)
    n := int32(nTemp)

    checkError(err)

    var topic []string

    for i := 0; i < int(n); i++ {
        topicItem := readLine(reader)
        topic = append(topic, topicItem)
    }

    result := acmTeam(topic)

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

