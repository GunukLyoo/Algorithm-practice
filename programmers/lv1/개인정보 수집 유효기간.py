def solution(today, terms, privacies):
    answer = []
    li = [i.split(" ") for i in terms]
    print(li)
    
    p = [i.replace('.', ' ') for i in privacies]
    lip = [i.split(" ") for i in p]
    print(lip)
    return answer
