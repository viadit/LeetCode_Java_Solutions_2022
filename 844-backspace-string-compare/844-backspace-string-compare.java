class Solution {
    public boolean backspaceCompare(String s, String t) {
        return updateString(s).equals(updateString(t));
    }
    
    public String updateString(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}