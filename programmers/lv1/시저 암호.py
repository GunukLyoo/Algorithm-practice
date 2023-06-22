def solution(s, n):
    answer = ''
    x = 0
    
    for i in range(len(s)):
        if s[i] == ' ':
            answer += ' '
        else:
            if ord(s[i]) >= 65 and ord(s[i]) <= 90:
                if (ord(s[i]) + n) > 90:
                    x = ord(s[i]) + n - 90 -1
                    answer += chr(x+65)
                else:
                    answer += chr(ord(s[i]) + n)
            elif ord(s[i]) >= 97 and ord(s[i]) <= 122:
                if (ord(s[i]) + n) > 122:
                    x = ord(s[i]) + n - 122 -1
                    answer += chr(x+97)
                else:
                    answer += chr(ord(s[i]) + n)
    
    return answer   
