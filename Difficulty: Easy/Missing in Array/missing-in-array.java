class Solution {
    int missingNum(int arr[]) {
        long sum = ((long)(arr.length + 1))*(arr.length + 2)/2;
        long actualSum = 0;
        
        for(int a: arr)
            actualSum += a;
            
        return (int)(sum - actualSum);
    }
}