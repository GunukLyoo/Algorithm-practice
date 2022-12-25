import sys

if __name__ == "__main__":

    arr = sys.stdin.readline()

    a = list()

    for i in range(26):
        a.append(0)

    max = 0
    maxi = 0
    maxc = 0

    for i in range(len(arr)-1):
        if ord(arr[i]) < 94:
            a[ord(arr[i]) - 65] += 1
        else:
            a[ord(arr[i]) - 97] += 1

    max = a[0];
    maxc = 1;

    for i in range(1,len(a)):
        if max == a[i]:
            maxc += 1
        elif max < a[i]:
            max = a[i]
            maxi = i
            maxc = 1

    if maxc == 1:
        print(chr(maxi + 65))
    else:
        print("?")
    
     
