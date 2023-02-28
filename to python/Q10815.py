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

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    m = int(sys.stdin.readline())
    arr1 = list(map(int, sys.stdin.readline().split()))

    arr.sort()

    for i in range(m):
        if arr1[i] in arr:
            print("1", end=' ')
        else:
            print("0", end=' ')
    
    
