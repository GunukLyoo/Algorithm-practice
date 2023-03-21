import sys

def maxprime(big, low):
    r = 0

    while low != 0:
        r = big % low
        big = low
        low = r

    return big
            

if __name__ == '__main__':
    n = int(sys.stdin.readline())
