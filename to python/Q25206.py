import sys

def gtos(grade):
    if grade == 'A+':
        return float(4.5)
    elif grade == 'A0':
        return float(4.0)
    elif grade == 'B+':
        return float(3.5)
    elif grade == 'B0':
        return float(3.0)
    elif grade == 'C+':
        return float(2.5)
    elif grade == 'C0':
        return float(2.0)
    elif grade == 'D+':
        return float(1.5)
    elif grade == 'D0':
        return float(1.0)
    elif grade == 'F':
        return float(0.0)

if __name__ == '__main__':
    arr = list()
    sum = 0.0
    sumg = 0.0

    for i in range(20):
        arr.append(sys.stdin.readline().split())
        if arr[i][2] != 'P':
            sumg += float(arr[i][1]) * gtos(arr[i][2])
            sum += float(arr[i][1])

    print(round(sumg/sum, 6))
