import sys

if __name__ == "__main__":

    n = list(map(int, sys.stdin.readline().split()))
    score = list(map(int, sys.stdin.readline().split()))

    for i in range(n[0]):
        max = score[i]
        maxi = i
        for j in range(i+1, n[0]):
            if max < score[j]:
                max = score[j]
                maxi = j

        x = score[i]
        score[i] = max
        score[maxi] = x

    print(score[n[1]-1])
