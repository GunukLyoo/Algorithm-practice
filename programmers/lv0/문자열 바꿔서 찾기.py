def solution(myString, pat):
    answer = 0
    li = list(pat)
    st = ''
    for i in range(len(li)):
        if li[i] == 'A':
            li[i] = 'B'
        else:
            li[i] = 'A'
        st += li[i]
    if st in myString:
        answer = 1
    return answer
