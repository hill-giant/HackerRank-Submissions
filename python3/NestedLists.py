def get_second_lowest(students):
    scores = [student[1] for student in students]
    second_lowest = max(scores)
    for score in scores:
        if score > min(scores) and score < second_lowest:
            second_lowest = score
    return second_lowest 

def create_list():
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name,score])
    return students

def print_matches(students, second_lowest):
    students.sort()
    for student in students:
        if student[1] == second_lowest:
            print(student[0])

if __name__ == "__main__":
    students = create_list()
    second_lowest = get_second_lowest(students)
    print_matches(students, second_lowest)

