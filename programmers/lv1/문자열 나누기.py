def solution(s):
    answer = 0
    cx = 1
    c = 0
    
    while len(s) > 0:
        if len(s) == 1:
            answer += 1
        else:
            cx = 1
            for i in range(1, len(s)):
                if cx == c:
                    answer += 1
                    s = s[i+1:]
                    c = 0
                    break
                    
                if s[0] == s[i]:
                    cx += 1
                else:
                    c += 1
                
            print(s)
                   
    return answer
