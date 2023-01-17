import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    c = 2
    max = n

    prime = list()
    prime.append(False)
    prime.append(False)

    for i in range(2, n+1):
        prime.append(True)

    while n != 1:
        if n%c == 0:
            n /= c
            print(c)
        else:
            c += 1
            if prime[c] == True:
                for j in range(c*c, max+1, c):
                    prime[j] = False
            else:
                while prime[c] != False:
                    c += 1
