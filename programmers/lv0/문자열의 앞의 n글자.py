def solution(my_string, n):
    answer = ''
    ar = my_string[:n]
    for i in ar:
        answer += i
    return answer
