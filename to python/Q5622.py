import sys

if __name__ == "__main__":

    arr = sys.stdin.readline()

    a = list()
    c = 0
    time = 3
    sum = 0

    while c < 26:
        if c == 15 or c == 22:
            a.append(time)
            a.append(time)
            a.append(time)
            a.append(time)
            time += 1
            c += 4
        else:
            a.append(time)
            a.append(time)
            a.append(time)
            time += 1
            c += 3


    for i in arr:
        if i != '\n':
            sum += a[ord(i) - 65]

    print(sum)

    
    
     
