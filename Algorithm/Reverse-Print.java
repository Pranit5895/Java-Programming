class  Solution {
    public  int [] reversePrint ( ListNode  head ) {
        int length = changdu(head);
        int []nums = new  int [length];
        bianli(head,nums,length);
        return nums;
    }

    int  changdu ( ListNode  head ){
        int count = 0 ;
        while (head != null ){
            count ++ ;
            head = head . next;
        }
        return count;
    }

    void  bianli ( ListNode  head , int [] nums , int  i ){
        if (head == null ) return ;
        bianli (head . Next, the nums, I - . 1 );
        nums[i - 1 ] = head . val;
    }

}