def solution(my_string, n):
    answer = ''
    ln = len(my_string)
    for i in range(ln - n, ln):
        answer += my_string[i]
    return answer
