def solution(s):
    answer = 0
    num = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in range(len(num)):
        if num[i] in s:
            s = s.replace(num[i], str(i))
    answer = int(s)
    return answer
