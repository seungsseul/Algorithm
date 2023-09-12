def solution(my_string):
    list1=list(my_string)
    list1.reverse()
    answer=""
    for string in list1:
        answer+=string
    return answer