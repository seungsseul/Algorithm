class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length!=arr2.length) {
            return arr1.length>arr2.length ? 1 : -1;
        }
        int arr1Sum = 0; int arr2Sum = 0;
        for(int num : arr1) {
            arr1Sum+=num;
        }
        for(int num : arr2) {
            arr2Sum+=num;
        }
        if(arr1Sum==arr2Sum) {
            return 0;
        }
        return arr1Sum>arr2Sum ? 1 : -1;
    }
}