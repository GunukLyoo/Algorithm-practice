def solution(my_string, is_suffix):
    answer = 0
    suf = []
    for i in range(len(my_string)):
        suf.append(my_string[i:])
    
    if is_suffix in suf:
        answer = 1
    return answer
