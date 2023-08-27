def solution(s):
    answer = ''
    li = list(map(int, s.split(" ")))
    li.sort()
    answer = str(li[0]) + " " + str(li[len(li)-1])
    return answer
