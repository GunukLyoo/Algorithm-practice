def solution(n):
    answer = 0
    arr = []
    if n % 2 == 0:
        arr = [i ** 2 for i in range(1,n+1) if i % 2 == 0]
        answer = sum(arr)
    else:
        arr = [i for i in range(1,n+1) if i % 2 != 0]
        answer = sum(arr)
    return answer
