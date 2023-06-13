def solution(t, p):
    answer = 0
    s = ''
    lp = len(p)
    for i in range(len(t)-lp+1):
        s = int(t[i:i+lp])
        if s <= int(p):
            answer += 1
    return answer
