T=int(input())
result4=[]
for i in range(T):
    N=int(input())
    result = []
    for n in range(N):
        text, le = input().split()
        result.append(text*int(le))
    result2=''.join(result)
    start=0
    end=10
    result3=[]
    for m in range(len(result2)//10+1):
        result3.append(result2[start:end])
        start += 10
        end += 10
    result4.append(result3)
for i in range(T):
    print("#"+str(i+1))
    for p in result4[i]:
        print(p)