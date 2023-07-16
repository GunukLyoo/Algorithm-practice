def solution(arr):
    answer = []
    i = 0
    c = 0
    while i < len(arr):
        if len(answer) == 0:
            answer.append(arr[i])
            i += 1
            c += 1
        elif answer[c-1] == arr[i]:
            del answer[c-1]
            i += 1
            c -= 1
        elif answer[c-1] != arr[i]:
            answer.append(arr[i])
            i += 1
            c += 1
    
    if len(answer) == 0:
        answer.append(-1)
    return answer
