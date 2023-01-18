import sys
from primePy import primes

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    c = 0
    prime = primes.upto(n)

    while n != 1:
        if n%prime[c] == 0:
            n /= prime[c]
            print(prime[c])
        else:
            c += 1
