import sys

if __name__ == '__main__':
    l = list(map(int, sys.stdin.readline().split()))
    total = 0

    while l[0] != 0 and l[1] != 0 and l[2] != 0:
        l.sort()

        if l[2] >= l[0] + l[1]:
            print("Invalid")
        else:
            if l[0] == l[1] and l[1] == l[2]:
                print("Equilateral")
            elif l[0] == l[1] or l[1] == l[2]:
                print("Isosceles")
            else:
                print("Scalene")

        del l
        l = list(map(int, sys.stdin.readline().split()))
    
    
    
