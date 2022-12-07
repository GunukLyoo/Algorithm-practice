import sys

if __name__ == "__main__":

    while 1:

        try:
            a, b = map(int, sys.stdin.readline().split())
            print(a + b)
        except:
            break
        
