def solution(s, skip, index):
    answer = ''
    alp = [chr(97 + i) for i in range(26)]
    for i in range(len(skip)):
        alp.remove(skip[i])
    
    for i in range(len(s)):
        a = alp.index(s[i])
        if a + index >= len(alp):
            a = a + index%len(alp) - len(alp)
            answer += alp[a]
        else:
            answer += alp[a+index]
    return answer
