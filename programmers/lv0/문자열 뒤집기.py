def solution(my_string, s, e):
    answer = ''
    li = list(my_string)
    li = li[:s] + li[s:e+1][::-1] + li[e+1:]
    for i in li:
        answer += i
    return answer
