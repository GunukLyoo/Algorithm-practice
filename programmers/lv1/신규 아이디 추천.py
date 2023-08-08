import re

def solution(new_id):
    answer = ''
    new_id = new_id.lower()
    for i in new_id:
        if i.isalpha() == False and i.isdigit() == False and i != '-' and i != '_' and i != '.':
            new_id = new_id.replace(i, '')
    
    new_id = re.sub(r'\.{2,}', '.', new_id)
    
    new_id = new_id.strip('.')
    
    if len(new_id) == 0:
        new_id += 'a'
    
    if len(new_id) > 15:
        new_id = new_id[:15]
        new_id = new_id.rstrip('.')
    elif len(new_id) < 3:
        while len(new_id) < 3:
            new_id += new_id[len(new_id) - 1]
            
    answer = new_id
            
    return answer
