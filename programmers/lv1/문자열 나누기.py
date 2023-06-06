def solution(s):
    answer = 0
    cx = 0
    c = 0
    
    while len(s) >= 1:
        for i in range(len(s)):
            if i == 0:
                cx = 1
            elif s[0] == s[i]:
                cx += 1
            else:
                c += 1
                
            if cx == c:
                answer += 1
                s = s[i+1:]
                cx = 0
                c = 0
                break
                
            if i == len(s)-1:
                answer += 1
                break
                    
        if len(s) == 1:
            answer += 1
            break
        
    return answer
