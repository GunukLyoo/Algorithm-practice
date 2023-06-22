def solution(n):
    answer = 0
    s = str(n)
    li = [int(i) for i in s]
    
    for i in li:
        answer += i

    return answer
