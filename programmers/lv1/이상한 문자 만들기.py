def solution(s):
    answer = ''
    c = 0
    
    for i in range(len(s)):
        if s[i] ==' ':
            answer += ' '
            c = 0
        else:
            if c == 0 or c % 2 == 0:
                answer += s[i].upper()
                c += 1
            else:
                answer += s[i].lower()
                c += 1
            
    return answer
