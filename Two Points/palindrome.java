
public class palindrome {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (!Character.isLetterOrDigit(left)) {
                i += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j -= 1;
                continue;
            }
            if (left != right)
                return false;
            else {
                i += 1;
                j -= 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        System.out.println(p.isPalindrome("manila"));
    }
}
