def solution(ingredient):
    answer = 0
    rec = "1231"
    st = ""
    check = True
    for i in ingredient:
        st += str(i)
    while check:
        if rec in st:
            answer += st.count(rec)
            st = st.replace(rec, "")
        else:
            check = False
        
    return answer
