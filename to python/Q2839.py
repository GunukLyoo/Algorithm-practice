import sys

if __name__ == "__main__":

    target = int(sys.stdin.readline())
    n = int(target/5)
    result = 0

    for i in range(n+1):
        remain = target - 5*(n-i)
        if remain%3 == 0:
            result = n - i + remain/3
            break
        else:
            result = -1

    print(int(result))
