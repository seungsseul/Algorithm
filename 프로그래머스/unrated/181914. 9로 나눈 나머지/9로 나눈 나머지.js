function solution(number) {
    var arr = number.split("");
    var num = 0;
    arr.map((e)=>num+=parseInt(e)) 
    var answer = num%9;
    return answer;
}