def solution(n, m, section):
    answer = 0
    count = 0

    for i in range(0, len(section), m):
        for j in range(i+1, len(section)):
            if m >= section[j] - section[i]:
                count += 1
            
    return answer
