function solution(my_string, n) {
    var answer = "";
    my_string.split("").map((e) => answer+=e.repeat(n));
    return answer;
}