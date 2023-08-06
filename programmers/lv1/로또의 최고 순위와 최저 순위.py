def solution(lottos, win_nums):
    answer = []
    c = 0
    for i in win_nums:
        if i in lottos:
            c += 1
    z = lottos.count(0)
    di = { 6-i:i+1 for i in range(6)}
    if c == 0:
        answer.append(1)
        answer.append(6)
    elif c == 0 and z == 1:
        answer.append(6)
        answer.append(6)
    else:
        answer.append(di[c+z])
        answer.append(di[c])
    return answer
