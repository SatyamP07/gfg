// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        int i;
        if(arr.length == 1)
            return arr[0];
        for(i = 0; i < arr.length - 1; i++)
            if(arr[i] > arr[i+1])
                break;
        return arr[i];
    }
}