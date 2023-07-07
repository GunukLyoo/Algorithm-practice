def solution(x1, x2, x3, x4):
    answer = False
    b1 = True
    b2 = True
    
    if x1 == False and x2 == False:
        b1 = False
    
    if x3 == False and x4 == False:
        b2 = False
        
    if b1 == True and b2 == True:
        answer = True
    
    return answer
