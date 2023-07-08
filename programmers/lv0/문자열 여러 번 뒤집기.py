def solution(my_string, queries):
    answer = ''
    li = list(my_string)
    li1 = []
    x = ''
    for i in queries:
        if i[0] == 0 and i[1] == len(my_string) -1:
            li = li[::-1]
        elif i[0] == 0:
            li = li[:i[1]+1][::-1] + li[i[1]+1:]
        elif i[1] == len(my_string) - 1:
            li = li[:i[0]] + li[i[0]:][::-1]
        else:
            li = li[:i[0]] + li[i[0]:i[1]+1][::-1] + li[i[1]+1:]
    
    for i in li:
        answer += i
    return answer
