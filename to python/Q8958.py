import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    
    for i in range(n):
        c = 0
        sc = 0
        arr = sys.stdin.readline()
        for ch in range(len(arr)):
            if arr[ch] == 'O':
                c += 1
                sc += c
            else:
                c = 0

        print(sc)
     
