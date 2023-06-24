def solution(s):
    answer = ''
    li = list(s)
    li.sort(reverse = True)
    answer = ''.join(i for i in li)
    return answer
