def solution(my_string, is_prefix):
    answer = 0
    pf = [my_string[:i+1] for i in range(len(my_string))]
    if is_prefix in pf:
        answer = 1
    return answer
