def solution(arr, queries):
    answer = []
    x = 0
    for i in range(len(queries)):
        x = arr[queries[i][0]]
        arr[queries[i][0]] = arr[queries[i][1]]
        arr[queries[i][1]] = x
    answer = arr
    return answer
