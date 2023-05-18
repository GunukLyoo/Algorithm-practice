import sys

if __name__ == "__main__":

    arr = list(sys.stdin.readline())

    loc = list()

    for i in range(26):
        loc.append(-1)

    for i in range(len(arr)-1):
        if loc[ord(arr[i]) - 97] == -1:
               loc[ord(arr[i]) - 97] = i

    print(*loc)
    
     
