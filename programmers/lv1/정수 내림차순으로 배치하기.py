def solution(n):
    answer = 0
    li = list(str(n))
    li.sort(reverse = True)
    answer = int(''.join(s for s in li))
    return answer
