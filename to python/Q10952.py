import sys

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())

    while a != 0 and b !=0:
        print(a + b)
        a, b = map(int, sys.stdin.readline().split())
        
