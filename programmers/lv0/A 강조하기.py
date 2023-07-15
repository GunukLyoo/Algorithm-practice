def solution(myString):
    answer = ''
    li = list(myString.lower())
    for i in range(len(li)):
        if li[i] == 'a':
            li[i] = 'A'
        answer += li[i]
    return answer
