import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())

    num = list(sys.stdin.readline())

    sum = 0

    for i in range(n):
        sum += int(num[i])

    print(sum)
     
