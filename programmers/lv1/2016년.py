def solution(a, b):
    answer = ''
    day = ['SUN','MON','TUE','WED','THU','FRI','SAT']
    m31 = [1, 3, 5, 7, 8, 10, 12]
    m30 = [4, 6, 9, 11]
    d = 0
    
    for i in range(1, a):
        if i in m31:
            d += 31
        elif i in m30:
            d += 30
        else:
            d += 29
    
    d += b
    d -= 2
    d %= 7
    
    answer = day[d-1]
    
    return answer
