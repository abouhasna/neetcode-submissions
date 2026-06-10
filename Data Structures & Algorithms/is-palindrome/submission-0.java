class Solution {
    public boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;
        char cL, cR;
        while(left < right){
            if (!Character.isLetterOrDigit(s.charAt(left)) || !Character.isLetterOrDigit(s.charAt(right))) {
              if (!Character.isLetterOrDigit(s.charAt(right))){
                  right--;
              }
              if (!Character.isLetterOrDigit(s.charAt(left))){
                  left++;
              }
              continue;
            }

            cL = Character.toLowerCase(s.charAt(left));
            cR = Character.toLowerCase(s.charAt(right));

            if(cL != cR)
                return false;
            
            left++;
            right--;
        }
        return true;
    }
}
