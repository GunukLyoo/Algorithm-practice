import sys

if __name__ == "__main__":

    arr = sys.stdin.readline()
    arr1 = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
    c = 0
    ct = 0

    while c < len(arr) - 1:
        if c < len(arr) - 2 and arr1.count(arr[c:c+3]) > 0:
            ct += 1
            c += 3
        elif c < len(arr) - 1 and arr1.count(arr[c:c+2]) > 0:
            ct += 1
            c += 2
        else:
            ct += 1
            c += 1

    print(ct)
    
     
