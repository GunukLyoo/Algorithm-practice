def solution(s):
    answer = -1
    c = -1
    st = s[:]
    s1 = ""
    se = set(st)

    while c < 0:
        if len(st) == 0:
            c = 1
        
        for i in range(0, len(se)):
            if st.count(se[i]*2):
                s1 = st.replace(se[i]*2, '')
                break
            else:
                if i == len(se)-1:
                    c = 0
                    break
        print(s1)
        st = s1
        s1 = ""
        se = set(st)
        
    answer = c

    return answer