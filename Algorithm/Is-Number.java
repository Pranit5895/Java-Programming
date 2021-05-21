class Solution {
    int i=0;
    public boolean isNumber(String s) {
        //input check
        if(s==null || s.length()==0)
            return false;
        s = s.trim();
        boolean A = scanInteger(s), B=false, C=false;
        if(i<s.length() && s.charAt(i)=='.'){
            i++;
            B = scanUnsignedInteger(s);
        }
        if(i<s.length() && (s.charAt(i)=='e' || s.charAt(i)=='E')){
            i++;
            C = scanInteger(s);
            if(C==false)
                return false;
        }
        return i==s.length() && (A || B);

    }
    private boolean scanInteger(String s){
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-'))
            i++;
        return scanUnsignedInteger(s);
    }
    private boolean scanUnsignedInteger(String s){
        int start = i;
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            i++;
        }
        return i > start;
    }
}