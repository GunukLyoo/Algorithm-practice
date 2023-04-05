import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    li = list()
    dp = dict()

    for i in range(n):
        li.append(sys.stdin.readline().split())
        dp[li[i][0]] = False
        dp[li[i][1]] = False

    dp["ChongChong"] = True
    count = 0
    check = False

    for i in range(n):
        if li[i][1] == "ChongChong":
            dp[li[i][0]] = True
        elif dp[li[i][0]] == True:
            dp[li[i][1]] = True
        elif dp[li[i][1]] == True:
            dp[li[i][0]] = True

    for key in dp:
        if dp[key] == True:
            count += 1

    print(count)
                
