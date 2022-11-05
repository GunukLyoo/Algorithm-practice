
if __name__ == "__main__":
    k, q, r, b, n, p = map(int, input().split())
    if(k != 1): k = 1 - k
    else: k = 0
    if(q != 1): q = 1 - q
    else: q = 0
    if(r != 2): r = 2 - r
    else: r = 0
    if(b != 2): b = 2 - b
    else: b = 0
    if(n != 2): n = 2 - n
    else: n = 0
    if(p != 8): p = 8 - p
    else: p = 0

    print(str(k) + " " + str(q) + " " + str(r) + " " + str(b) + " " + str(n) + " " + str(p))
