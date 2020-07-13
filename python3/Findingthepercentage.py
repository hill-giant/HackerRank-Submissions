def get_average(marks):
    summ = 0
    for mark in marks:
        summ += mark
    average = summ / len(marks)
    return format(average, '.2f')

if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    print(get_average(student_marks[query_name]))

