if __name__ == "__main__":
    h, m = map(int, input().split())
    t = int(input())

    if m+t >= 60:
        if(h + (m+t)/60) >= 24:
            print(str(int((h + (m+t)/60)-24)) + " " + str((m+t)%60))
        else:
            print(str(int((h + (m+t)/60))) + " " + str((m+t)%60))
    else:
        print(str(h) + " " + str(m+t))
