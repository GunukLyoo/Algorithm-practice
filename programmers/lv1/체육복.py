def solution(n, lost, reserve):
    sl = []
    for i in lost:
        if i not in reserve:
            sl.append(i)
        if i in reserve:
            reserve.remove(i)

    answer = n - len(sl)
    reserve.sort()
    sl.sort()
            
    for i in sl:
        if i-1 in reserve:
            answer += 1
            reserve.remove(i-1)
        elif i+1 in reserve:
            answer += 1
            reserve.remove(i+1)

    return answer
