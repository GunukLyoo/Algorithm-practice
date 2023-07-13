def solution(str_list):
    answer = []
    if 'l' in str_list and 'r' in str_list:
        if str_list.index('l') < str_list.index('r'):
            answer = str_list[:str_list.index('l')]
        else:
            answer = str_list[str_list.index('r') + 1:]
    elif 'l' in str_list and 'r' not in str_list:
        answer = str_list[:str_list.index('l')]
    elif 'l' not in str_list and 'r' in str_list:
        answer = str_list[str_list.index('r') + 1:]
    return answer
