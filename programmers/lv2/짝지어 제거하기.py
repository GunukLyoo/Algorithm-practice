def solution(s):
    answer = -1
    c = -1
    st = s[:]
    s1 = ""

    while c < 0:
        for i in range(0, len(st)-1):
            print(i)
            if st[i] == st[i+1]:
                continue               
            else:
                s1 += st[i]
        print(st)
        print(s1)
        st = s1
        s1 = ""
        c = 0

    return answer
