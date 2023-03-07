import sys

def xtoy(arr, x, y, total):
    sum = 0
		
    if y-x+1 < arr.length/2:
        for i in range(x-1, y):
            sum = sum + arr[i]
	return sum
    else:
        if x != 1:
            for i in range(x-1):
                sum += arr[i]
			
        for i in range(y, len(arr)):
            sum += arr[i]

	return total - sum;

if __name__ == "__main__":
    arr = list(map(int, sys.stdin.readline().split()))
    arr1 = list(map(int, sys.stdin.readline().split()))

    for i in range(arr[1]):
        arr2 = list(map(int, sys.stdin.readline().split()))
        if arr2[0] == arr2[1]:
            print(arr1[arr2[0]-1])
        else:
            sum = 0
            for j in range(arr2[0]-1, arr2[1]):
                sum += arr1[j]
            print(sum)
