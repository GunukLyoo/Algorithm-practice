def solution(arr, k):
    answer = []
    c = 0
    for i in arr:
        if i not in answer:
            answer.append(i)
            c += 1
            if c == k:
                break
    if len(answer) < k:
        for i in range(k-len(answer)):
            answer.append(-1)
    return answer
