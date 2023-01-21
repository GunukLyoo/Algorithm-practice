import sys

if __name__ == "__main__":

    num = list(map(int, sys.stdin.readline().split()))

    prime = list()
    prime.append(False)
    prime.append(False)

    for i in range(2, num[1]+1):
        prime.append(True)

    for i in range(2, num[1]+1):
        if(prime[i]):
            for j in range(i*i, num[1]+1, i):
                prime[j] = False

    for i in range(num[0], num[1]+1):
        if prime[i] == True:
            print(i)
