def solution(arr, queries):
    answer = []
    ar = []
    n = -1
    for i in range(len(queries)):
        n = -1
        ar = arr[queries[i][0]:queries[i][1]+1]
        ar.sort()
        for j in ar:
            if j > queries[i][2]:
                n = j
                break
        
        answer.append(n)
    return answer
