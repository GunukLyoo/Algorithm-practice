import sys

if __name__ == '__main__':
    str1 = sys.stdin.readline().strip()
    check = 1

    for i in range(int(len(str1)/2)):
        if str1[i] != str1[len(str1)-(i+1)]:
            check = 0

    print(check)
    
