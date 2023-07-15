def solution(my_string, alp):
    answer = ''
    li = list(my_string)
    for i in range(len(li)):
        if li[i] == alp:
            li[i] = li[i].upper()      
        answer += li[i]
    return answer
