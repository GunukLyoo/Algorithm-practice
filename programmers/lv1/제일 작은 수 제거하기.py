def solution(arr):
    if len(arr) >1:
        answer = arr.copy()
        arr.sort()
        answer.remove(arr[0])
    else:
        answer = [-1]
    return answer
