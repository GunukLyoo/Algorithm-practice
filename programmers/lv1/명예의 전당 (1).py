def solution(k, score):
    answer = []
    bf = []
    
    for i in score:
        if len(bf) < k:
            bf.append(i)
            bf.sort()
            answer.append(bf[0])
        else:
            bf.append(i)
            bf.sort()
            del bf[0]
            answer.append(bf[0])
    
    return answer
