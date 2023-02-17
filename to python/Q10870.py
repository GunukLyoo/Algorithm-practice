import sys

def fibo(Fn, n, c):
    fn = 0
    if c <= n:
        Fn[c] = Fn[c-2] + Fn[c-1]
        fn = fibo(Fn, n, c + 1)
    else:
        fn = Fn[n]

    return fn

if __name__ == "__main__":

    n = int(sys.stdin.readline())

    if n == 0:
        total = 0
    else:
        total = fibo(1, n, 1)

    print(total)
