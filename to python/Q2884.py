
if __name__ == "__main__":
    a, b = map(int, input().split())

    if(b - 45 < 0):
        m = 60-(45 - b)
        if(a == 0):
            t = 23
        else:
            t = a - 1
    else:
        m = b - 45
        t = a

    print(str(t) + " " + str(m))
