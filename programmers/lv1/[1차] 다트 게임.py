def solution(dartResult):
    answer = 0
    option = ['S', 'D', 'T']
    nums = []
    ai = 0
    c = 0
    n = 0
        
    while c < len(dartResult):
        if dartResult[c:c+2] == '10':
            n = int(dartResult[c:c+2]) ** (option.index(dartResult[c+2])+1)
            
            if c+3 < len(dartResult):
                if dartResult[c+3] == '*':
                    if ai == 0:
                        n *= 2
                    else:
                        n *= 2
                        nums[ai-1] *= 2
                    c += 4
                elif dartResult[c+3] == '#':
                    n *= -1
                    c += 4
                else:
                    c += 3
            else:
                c += 3
            
            nums.append(n)
            ai += 1
            
        else:
            n = int(dartResult[c]) ** (option.index(dartResult[c+1])+1)
            
            if c+2 < len(dartResult):
                if dartResult[c+2] == '*':
                    if ai == 0:
                        n *= 2
                    else:
                        n *= 2
                        nums[ai-1] *= 2
                    c += 3
                elif dartResult[c+2] == '#':
                    n *= -1
                    c += 3
                else:
                    c += 2
            else:
                c += 2
            
            nums.append(n)
            ai += 1
    
    answer = sum(nums)
    
    return answer
