import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    c = 2

    prime = list()
    prime.append(False)
    prime.append(False)

    for i in range(2, n+1):
        prime.append(True)

    for i in range(n+1):
        if(prime[i]):
            for j in range(i*i, n+1, i):
                prime[j] = False


    while n != 1:
        if n%c == 0:
            n /= c
            print(c)
        else:
            c += 1
            if prime[c] == True:
                continue
            else:
                while prime[c] != False:
                    c += 1
