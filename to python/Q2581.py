import sys

if __name__ == "__main__":

    min = int(sys.stdin.readline())

    max = int(sys.stdin.readline())
    
    sum = 0
    mp = 0

    prime = list()
    prime.append(False)
    prime.append(False)

    for i in range(2, 10001):
        prime.append(True)

    for i in range(10001):
        if(prime[i]):
            for j in range(i*i, 1001, i):
                prime[j] = False

    for i in range(min, max+1):
        if prime[i] == True and mp == 0:
            mp = i
            sum += i
        elif prime[i] == True:
            sum += i


    if sum == 0:
        print(-1)
    else:
        print(sum)
        print(mp)
