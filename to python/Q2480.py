if __name__ == "__main__":
    a, b, c = map(int, input().split())
    
    if a == b:
        if a == c:
            print(10000 + a * 1000)
        else:
            print(1000 + a * 100)
    else:
        if a == c:
            print(1000 + a * 100)
        elif b == c:
            print(1000 + b * 100)
        else:
            print(max(a,b,c) * 100)
