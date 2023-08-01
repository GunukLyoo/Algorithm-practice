def solution(babbling):
    answer = 0
    li = ["aya", "ye", "woo", "ma"]
    check = True
    c = 0
    
    for i in range(len(babbling)):
        check = True
        c = 0
        for j in li:
            if j in babbling[i]:
                c += 1
                if babbling[i].count(j*2) >= 1:
                    check = False
                    break
                else:
                    babbling[i] = babbling[i].replace(j, "x")
        if c == 0:
            check = False
            
        if check == True and len(babbling[i]) == babbling[i].count("x"):
            answer += 1

    return answer
