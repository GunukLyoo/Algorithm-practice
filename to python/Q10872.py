import sys

def factorial(total, max, n):
    ft = total
    if max >= n:
        ft = factorial(total*n, max, n + 1)

    return ft

if __name__ == "__main__":

    n = int(sys.stdin.readline())

    if n == 0:
        total = 1
    else:
        total = factorial(1, n, 1)

    print(total)
