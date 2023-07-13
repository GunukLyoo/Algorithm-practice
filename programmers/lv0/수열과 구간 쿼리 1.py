def solution(arr, queries):
    answer = arr.copy()
    for i in range(len(queries)):
        for j in range(queries[i][0], queries[i][1] + 1):
            answer[j] += 1
    return answer
