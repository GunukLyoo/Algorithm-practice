def solution(arr):
    stk = []
    i = 0
    l = 0
    while i < len(arr):
        if l == 0:
            stk.append(arr[i])
            i += 1
            l += 1
        elif l != 0 and stk[l - 1] < arr[i]:
            stk.append(arr[i])
            i += 1
            l += 1
        elif l != 0 and stk[l - 1] >= arr[i]:
            del stk[l - 1]
            l -= 1
    return stk
