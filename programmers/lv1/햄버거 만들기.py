def solution(ingredient):
    answer = 0
    rec = "1231"
    rec1 = [1,2,3,1]
    st = ""
    for i in ingredient:
        st += str(i)
        if len(st) > 3:
            if st[len(st)-4:len(st)] == rec:
                answer += 1
                st = st.replace(rec, "")
        
    return answer
