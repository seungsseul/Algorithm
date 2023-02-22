def solution(list):
    sorted(list)
    length=len(list)/2
    real_length=len(set(list))
    if length<real_length:
        return length
    else:
        return real_length

    answer = 0
    return answer
