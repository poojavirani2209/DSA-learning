package org.example;

public class CheckIfStringIsPalindrome {

   public boolean check(String stringToCheck){
       for(int i=0;i<stringToCheck.length();i++){
          if( stringToCheck.charAt(i)!=stringToCheck.charAt(stringToCheck.length()-i-1)) {
              return false;
          }
       }
       return true;
   }

    public static void main(String[] args) {
        CheckIfStringIsPalindrome checkIfStringIsPalindrome = new CheckIfStringIsPalindrome();
        System.out.println("The string radar is palindrome: "+checkIfStringIsPalindrome.check("radar"));
        System.out.println("The string abc is palindrome: "+checkIfStringIsPalindrome.check("abc"));
        System.out.println("The string abc is palindrome: "+checkIfStringIsPalindrome.check("aabbaa"));

    }
}
