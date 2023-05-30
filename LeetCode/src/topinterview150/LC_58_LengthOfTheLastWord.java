package src.topinterview150;

public class LC_58_LengthOfTheLastWord {

    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;
        while(i>=0 && s.charAt(i) == ' ') {
            i--;
        }
        while(i>=0 && s.charAt(i) != ' ') {
            len++; i--;
        }
        return len;
    }

}
