class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String revString=new StringBuilder(str).reverse().toString();
        return revString.equals(str);

    }
}