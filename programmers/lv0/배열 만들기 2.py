def solution(l, r):
    answer = []
    st = ''
    for i in range(l,r+1):
        st = str(i)
        if st.count('5') + st.count('0') == len(st):
            answer.append(i)
    if len(answer) == 0:
        answer.append(-1)
    return answer
