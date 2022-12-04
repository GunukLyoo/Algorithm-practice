
if __name__ == "__main__":
    a = int(input())

    for i in range(0,a):
        str = ''
        for j in range(0,i+1):
            str = str + '*'
        print(str)
