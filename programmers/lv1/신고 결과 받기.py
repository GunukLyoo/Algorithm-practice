def solution(id_list, report, k):
    answer = [0 for i in id_list]
    report = list(set(report))
    report.sort(key = lambda x: x[0])
    count = { id_list[i]: 0 for i in range(len(id_list))}
    ban = []
    li = [] 
    for i in report:
        li = i.split(" ")
        count[li[1]] += 1
    for key, val in count.items():
        if val >= k:
            ban.append(key)
    bf = { id_list[i]: 0 for i in range(len(id_list))}
    for i in report:
        li = i.split(" ")
        if li[1] in ban:
            bf[li[0]] += 1
    answer = [val for val in bf.values()]
    return answer
