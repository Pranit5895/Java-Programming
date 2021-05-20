class  Solution {
    public  int  findRepeatNumber ( int [] nums ) {
        int len = nums . length;
        for ( int i =  0 ; i < len; i ++ ) {
            while (nums[i] != i) { // Ensure that the position of the new element exchanged is also correct, that is, let: a[i]=i
                if (nums[i] == nums[nums[i]]) { // Map the number of each position exchange to its corresponding array subscript, when a new element appears and the number in the corresponding subscript is equal , It is a repeating number
                    return nums[i];
                }
                int temp = nums[i]; // Exchange, make the array value of the corresponding subscript equal to its subscript value, that is, let a[i]=i
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return  - 1 ;
    }
}