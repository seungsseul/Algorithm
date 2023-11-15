function solution(my_string, alp) {
    var answer = "";
    my_string.split("").map((e) => answer+= e==alp ? e.toUpperCase() : e);
    return answer;
}