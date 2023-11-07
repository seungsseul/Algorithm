function solution(array) {
    array.sort(function numberSort(a,b) { return a-b });
    return array[parseInt(array.length/2)];
}