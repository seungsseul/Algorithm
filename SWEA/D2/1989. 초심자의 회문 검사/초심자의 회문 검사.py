x=int(input())
Num=[]

for i in range(x):
    Num.append("#"+str(i+1))
    palindrome=input()
    for m in range(len(palindrome)):
        if palindrome[m]==palindrome[(len(palindrome)-1)-m] and m==(len(palindrome)-1):
            print(Num[i] + " 1")
        elif palindrome[m]!=palindrome[(len(palindrome)-1)-m] and m==(len(palindrome)-1):
            print(Num[i]+" 0")
        else:
            pass