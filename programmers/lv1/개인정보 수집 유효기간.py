def solution(today, terms, privacies):
    answer = []
    li = {i.split(" ")[0]:i.split(" ")[1] for i in terms}
    t = 0
    print(li)
    
    p = [i.replace('.', ' ') for i in privacies]
    lip = [i.split(" ") for i in p]
    print(lip)
    
    for i in range(len(lip)):
        t = li[lip[i][3]]
        print(t)
        lip[i][1] += t
        if lip[i][1] > 12:
            lip[i][0] += 1
            lip[i][1] -= 12
    print(lip)
        
    return answer
