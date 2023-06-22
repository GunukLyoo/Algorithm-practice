def solution(n):
    answer = []
    li = list(str(n))
    li.reverse()
    answer = [int(i) for i in li]
    print(answer)
    return answer
