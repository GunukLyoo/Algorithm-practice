import sys

if __name__ == "__main__":

    n = sys.stdin.readline()

    if len(n) == 2:
        print(ord(n[0]))
    else:
        print(chr(int(n)))
           
     
