def solution(arr):
    answer = 0
    li = []
    li.append(arr.copy())
    c = 0
    while True:
        c += 1
        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                arr[i] //= 2
            elif arr[i] < 50 and arr[i] % 2 == 1:
                arr[i] = arr[i] * 2 + 1
        
        li.append(arr.copy())
        if li[c-1] == li[c]:
            answer = c - 1
            break

    return answer
