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
    Fn = [0 for i in range(n+1)]
    Fn[1] = 1
    
    if n == 0:
        total = 0
    elif n == 1:
        total = 1
    else:
        total = fibo(Fn, n, 2)

    print(total)
