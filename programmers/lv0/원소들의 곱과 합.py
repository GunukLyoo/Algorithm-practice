def solution(num_list):
    answer = 0
    m = 1
    for i in num_list:
        m *= i
    
    if m < sum(num_list) ** 2:
        answer = 1
    else:
        answer = 0
    return answer
