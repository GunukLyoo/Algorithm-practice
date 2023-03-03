import sys

def binary_search(target, data):
    data.sort()
    start = 0
    end = len(data) - 1

    while start <= end:
        mid = (start + end) // 2

        if data[mid] == target:
            return mid # 함수를 끝내버린다.
        elif data[mid] < target:
            start = mid + 1
        else:
            end = mid -1

    return None

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    lesser_arr, equal_arr, greater_arr = [], [], []
    for num in arr:
        if num < pivot:
            lesser_arr.append(num)
        elif num > pivot:
            greater_arr.append(num)
        else:
            equal_arr.append(num)
    return quick_sort(lesser_arr) + equal_arr + quick_sort(greater_arr)

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    m = int(sys.stdin.readline())
    arr1 = list(map(int, sys.stdin.readline().split()))

    qarr = quick_sort(arr)

    for i in range(m):
        res = binary_search(arr1[i], qarr)
        if res == None:
            print("0", end=' ')
        else:
            print("1", end=' ')
    
    
