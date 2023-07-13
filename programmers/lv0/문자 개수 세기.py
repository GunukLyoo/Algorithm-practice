def solution(my_string):
    answer = []
    big = [0 for i in range(26)]
    low = [0 for i in range(26)]
    
    for i in my_string:
        if ord(i)>= 65 and ord(i) <= 90:
            big[ord(i)-65] += 1
        elif ord(i)>= 97 and ord(i) <= 122:
            low[ord(i)-97] += 1
    answer = big + low
    return answer
