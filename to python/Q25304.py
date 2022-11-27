if __name__ == "__main__":
    sum = int(input())
    n = int(input())

    for i in range(0,n):
        a, b = map(int, input().split())
        sum = sum - (a * b)

    if sum == 0:
        print("Yes")
    else:
        print("No")
