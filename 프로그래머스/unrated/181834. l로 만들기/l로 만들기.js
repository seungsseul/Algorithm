function solution(myString) {
    var answer = '';
    var charI = 'l'.charAt(0);
    for(let i=0;i<myString.length;i++) {
        if(myString.charAt(i)<charI) {
            answer+='l';
        }
        else {
            answer+=myString.charAt(i);
        }
    }
    return answer;
}