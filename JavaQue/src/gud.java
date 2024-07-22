class Solution {
    public int balancedStringSplit(String s) {
    
        int balance = 0;
        int count = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                balance++;
            } else if (ch == 'L') {
                balance--;
            }
            
            if (balance == 0) {
                count++;
            }
        }
        
        return count;
    }
    
}