def solution(s):
    answer = 0
    cx = 0
    c = 0
    
    while len(s) > 0:
        if len(s) == 1:
            answer += 1
        else:
            cx = 0
            c = 0
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
                    print(s)
                    c = 0
                    break
        
    return answer
