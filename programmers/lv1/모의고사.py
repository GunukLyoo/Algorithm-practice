def solution(answers):
    answer = []
    p = [[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]]
    c1 = c2 = c3 = 0
    s = {1:0, 2:0,3:0}
    
    for i in range(len(answers)):
        if p[0][c1] == answers[i]:
            s[1] += 1
        
        if p[1][c2] == answers[i]:
            s[2] += 1
            
        if p[2][c3] == answers[i]:
            s[3] += 1
            
        c1 += 1
        c2 += 1
        c3 += 1
            
        if c1 == len(p[0]):
            c1 = 0
        
        if c2 == len(p[1]):
            c2 = 0
            
        if c3 == len(p[2]):
            c3 = 0
    
    s = sorted(s.items(), key = lambda x: -x[1])
    answer.append(1)
    
    if s[0][1] == s[1][1]:
        answer.append(2)
        if s[0][1] == s[2][1]:
            answer.append(3)
            
    answer.sort()
    
    return answer
