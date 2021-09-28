package Canvas_HomeWork.array_Practice_III;

public class Longest_Palindrome {
    public static void main(String[] args) {
        String[] palindrome ={"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String result = "";
        String longestPalindrome = "";
        for (int i = 0; i <palindrome.length; i++) {
            String reverse = "";
                        for (int j = palindrome[i].length()-1; j>=0; j--) {
                            reverse += palindrome[i].charAt(j);
                        }
                        if (palindrome[i].equals(reverse)){
                            result = reverse;

                            if(longestPalindrome.length() < result.length()){
                                longestPalindrome = result;
                            }
                            System.out.println(reverse);
                        }
        }
        if(longestPalindrome.equals("")){
            System.out.println("No Palindrome");
        } else {
            System.out.println(longestPalindrome);
        }
    }
}
