def solution(sizes):
    answer = 0
    l = []
    l2 = []
    for i in range(len(sizes)):
        if sizes[i][0] >= sizes[i][1]:
            l.append(sizes[i][0])
            l2.append(sizes[i][1])
        else:
            l2.append(sizes[i][0])
            l.append(sizes[i][1])
    answer = max(l) * max(l2)
    return answer
