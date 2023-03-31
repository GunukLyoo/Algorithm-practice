import sys

if __name__ == '__main__':
    angle = list()
    total = 0

    for i in range(3):
        angle.append(int(sys.stdin.readline()))
        total += angle[i]

    if total != 180:
        print("Error")
    else:
        angle.sort()

        if angle[0] == angle[1] and angle[1] == angle[2]:
            print("Equilateral")
        elif angle[0] == angle[1] or angle[1] == angle[2]:
            print("Isosceles")
        else:
            print("Scalene")
    
    
    
