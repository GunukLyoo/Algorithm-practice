import sys

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

    m = int(sys.stdin.readline())
    arr1 = list()
    sum = 0

    for i in range(m):
        n = int(sys.stdin.readline())
        arr1.append(n)
        sum += n

    arr1 = quick_sort(arr1)

    
    print(int(sum/m))
    print(arr1[m/2])
