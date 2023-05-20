import math

if __name__ == "__main__":
    a = list(map(int, sys.stdin.readline().split()))
    m = math.prod(a)
    print(m)
