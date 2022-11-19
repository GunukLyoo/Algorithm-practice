
if __name__ == "__main__":
    a, b = map(int, input())
    p = int(input())

    if p >= 60:
        h = p/60
        m = p%60
        if(a==23):
            if(b+m > 60):
                h = h
                m = m + b - 60
            
            
    
