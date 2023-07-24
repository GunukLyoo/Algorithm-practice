def solution(X, Y):
    answer = ''
    xl = list(X)
    yl = list(Y)
    s = []
    
    for i in range(len(xl)):
        if xl[i] in yl:
            s.append(xl[i])
            del yl[yl.index(xl[i])]
    s.sort(reverse = True)
    
    if len(s) == 0:
        answer = "-1"
    else:
        for i in s:
            answer += i
        if int(answer) == 0:
            answer = "0"
    return answer
