def solution(s):
    answer = ''
    s = s.lower()
    
    li = s.split(" ")
    
    for i in s:
        li2 = list(i)
        if li2[0].isalpha() == True:
            li2[0] = li2[0].upper()
    
    print(li)
    
    return answer
