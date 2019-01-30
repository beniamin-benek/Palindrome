class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,6,3,2,1}; //przykładowy ciąg

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println(palindromeChecker.isThisPalindrome(array));

    }

}