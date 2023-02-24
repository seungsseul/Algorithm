def solution(s, skip, index):
    arr=[]
    skip_len=len(skip)
    s_len=len(s)
    answer = ''
    for i in range(skip_len):
        arr.append(ord(skip[i]))
    for i in range(s_len):
        tmp=ord(s[i])
        idx=0;
        while True:
            if idx==index:
                break
            tmp = tmp + 1
            if tmp in arr:
                continue
            if tmp==123:
                tmp=96
                continue
            idx+=1
        answer = answer+chr(tmp)
    return answer