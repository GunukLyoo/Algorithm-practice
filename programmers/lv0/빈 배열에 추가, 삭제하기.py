def solution(arr, flag):
    answer = []
    for i in range(len(arr)):
        if flag[i] == True:
            answer += [arr[i] for j in range(arr[i] * 2)]
        else:
            for j in range(arr[i]):
                del answer[len(answer) - 1]
    return answer
