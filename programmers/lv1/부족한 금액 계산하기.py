def solution(price, money, count):
    answer = -1
    sum = 0
    
    for i in range(count):
        sum += price * (i + 1)
    
    if money - sum < 0:
        answer = sum - money
    else:
        answer = 0

    return answer
