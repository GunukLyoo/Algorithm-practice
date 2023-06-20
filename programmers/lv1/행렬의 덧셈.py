def solution(arr1, arr2):
    answer = []
    li = []
    
    for i in range(len(arr1)):
        for j in range(len(arr1[i])):
            li.append(arr1[i][j] + arr2[i][j])
        answer.append(list(li))
        li.clear()
    return answer
