def solution(strArr):
    answer = 0
    strArr.sort(key = lambda x: len(x))
    li = []
    c = 0
    l = 1
    for i in strArr:
        if len(i) == l:
            c += 1
        else:
            li.append(c)
            c = 1
            l += 1
    li.append(c)
    answer = max(li)
    return answer
