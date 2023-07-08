def solution(number):
    answer = 0
    li = list(number)
    for i in li:
        answer += int(i)
    answer %= 9
    return answer
