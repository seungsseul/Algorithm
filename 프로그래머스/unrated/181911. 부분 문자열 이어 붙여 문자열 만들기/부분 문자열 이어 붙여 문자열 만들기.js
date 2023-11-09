function solution(my_strings, parts) {
    var answer = '';
    for(var i=0;i<my_strings.length;i++) {
        answer=answer+my_strings[i].substring(parts[i][0],parts[i][1]+1);
    }
    return answer;
}