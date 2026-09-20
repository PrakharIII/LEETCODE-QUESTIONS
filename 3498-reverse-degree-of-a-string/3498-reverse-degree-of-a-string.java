class Solution {
    public int reverseDegree(String s) {
        int a=0;
        for(int i=0;i<s.length();i++){
           a+=('z'-s.charAt(i)+1)*(i+1);
        }
        return a;
    }
}