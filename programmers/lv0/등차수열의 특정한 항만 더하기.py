def solution(a, d, included):
    answer = 0
    n = a
    for i in included:
        if i == True:
            answer += n
        n += d
    return answer
