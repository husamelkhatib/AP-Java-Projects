class MSOE20161 {
    public static void main(String[] args) {

        String str = "yeyeyeyeyeyeyeyeyeyey", reverseStr = "";

        int strLength = str.length();

        for (int lcv = (strLength - 1); lcv >=0; --lcv) {
            reverseStr = reverseStr + str.charAt(lcv);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
