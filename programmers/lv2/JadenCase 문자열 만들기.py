def solution(s):
    answer = ''
    c = 0
    s = s.lower()
    
    for i in s:
        if i.isalpha() == True and c == 0:
            answer += i.upper()
            c += 1
        elif i == ' ':
            answer += i
            c = 0
        else:
            answer += i
            c += 1
    
    return answer
