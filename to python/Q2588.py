
if __name__ == "__main__":
    n1 = int(input())
    n2 = int(input())

    a = n2 % 10
    b = (n2 - a) % 100
    c = (n2 - a - b) % 1000

    s1 = n1 * a
    s2 = int(n1 * b / 10)
    s3 = int(n1 * c / 100)

    print(s1)
    print(s2)
    print(s3)

    sum = s1 + s2 * 10 + s3 * 100

    print(sum)

    


