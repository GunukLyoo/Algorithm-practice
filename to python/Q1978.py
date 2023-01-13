import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())

    num = list(map(int, sys.stdin.readline().split()))

    c = 0

    prime = list()
    prime.append(False)
    prime.append(False)

    for i in range(2, 1001):
        prime.append(True)

    for i in range(1001):
        if(prime[i]):
            for j in range(i*i, 1001, i):
                prime[j] = False

    for i in range(n):
        if prime[num[i]] == True:
            c += 1


    print(c)
        
