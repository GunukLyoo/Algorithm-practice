import numpy as np

def solution(ingredient):
    answer = 0
    rec = [1,2,3,1]
    arr = ingredient.copy()
    i = 1
    li = list(np.where(np.array(arr) == 1)[0])
    
    if len(li) < 2:
        answer = 0
    else:
        while i < len(li):
            if li[i] - li[i-1] == 3:
                print(arr)
                if arr[li[i-1]:li[i]+1] == rec:
                    answer += 1
                    del arr[li[i-1]:li[i]+1]
                    del li[i-1:i+1]
                    if len(li) < 2:
                        break
                    else:
                        for j in range(i-1, len(li)):
                            li[j] -= 4
                        i = 1
            i += 1
    
    print(li)
        
    return answer
