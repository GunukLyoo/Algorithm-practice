import sys

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(a + b)
    print(a - b)
    print(a * b)
    print(int(a / b))
    print(a % b)
