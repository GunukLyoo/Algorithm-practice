def solution(arr, idx):
    answer = 0
    print(arr[idx:])
    if 1 in arr[idx:]:
        answer = arr[idx:].index(1) + idx
    else:
        answer = -1
    return answer
