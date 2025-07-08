class Solution {
    public void sortInWave(int arr[]) {
        int i = 1;
        int temp;
        while (i < arr.length){
            temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
            i += 2;
        }
    }
}
