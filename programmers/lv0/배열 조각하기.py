def solution(arr, query):
    answer = []
    li = arr.copy()
    for i in range(len(query)):
        if i % 2 == 0:
            li = li[:query[i] + 1]
        else:
            li = li[query[i]:]
    answer = li
    return answer
