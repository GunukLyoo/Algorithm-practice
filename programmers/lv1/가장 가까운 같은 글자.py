def solution(s):
    answer = []
    dc = {}
    
    for i in range(len(s)):
        if s[i] in dc:
            answer.append(i-dc[s[i]])
            dc[s[i]] = i
        else:
            answer.append(-1)
            dc[s[i]] = i
    return answer
