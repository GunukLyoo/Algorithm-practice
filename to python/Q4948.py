import sys

if __name__ == "__main__":

    num = list()
    c = int(sys.stdin.readline())

    while c != 0:
        num.append(c)
        c = int(sys.stdin.readline())

    max = int(123456)

    prime = list()
    prime.append(False)
    prime.append(False)

    for i in range(2, max+1):
        prime.append(True)

    for i in range(2, max+1):
        if(prime[i]):
            for j in range(i*2, max+1, i):
                prime[j] = False

    for i in num:
        print(i)
        c = 0
        if 2*i <= max:
            for j in range(i+1, 2*i + 1):
                if prime[j]:
                    c += 1
        elif 2*i > max:
            for j in range(i+1, max+1):
                if prime[j]:
                    c += 1
        print(c)
    
