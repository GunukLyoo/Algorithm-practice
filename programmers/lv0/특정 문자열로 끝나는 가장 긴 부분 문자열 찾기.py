def solution(myString, pat):
    answer = ''
    li = list(myString)
    pl = list(pat)
    for i in range(len(li)-1, -1, -1):
        if pl == li[i-len(pat)+1:i+1]:
            li = li[:i+1]
            break
    for i in li:
        answer += i
    return answer
