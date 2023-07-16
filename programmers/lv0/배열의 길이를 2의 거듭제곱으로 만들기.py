def solution(arr):
    answer = arr.copy()
    n = 1
    while len(answer) > n:
        n *= 2
    if len(answer) < n:
        for i in range(n-len(answer)):
            answer.append(0)
    return answer
