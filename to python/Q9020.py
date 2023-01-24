import sys

if __name__ == "__main__":

    num = list()
    n = int(sys.stdin.readline())

    for i in range(n):
        num.append(int(sys.stdin.readline()))

    max = int(10000)

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
        h = int(i/2)
        A = h
        B = h
        if prime[h]:
            A = h
            B = h
        else:
            while True:
                A -= 1
                B += 1
                if prime[A] and prime[B]:
                    break
        
        print(str(A) + " " + str(B))
    
