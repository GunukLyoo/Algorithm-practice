import sys

if __name__ == "__main__":

    num = int(sys.stdin.readline())
    nums = list(map(int, sys.stdin.readline().split()))
    sum = 0
    max = 0

    for i in nums:
        if max < i:
            max = i

    for i in range(num):
        nums[i] = nums[i]/max*100

    for i in nums:
        sum += i

    print(sum/num)

