import java.util.*;
public class Palindrome {
  
 
 /*
  * Implement this method and return true if the word is the same 
  * forward and backwards
  * Do not use automatic methods for reversing the string
  */
 private boolean isPalindrome(String word) {
   String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);
      original = in.nextLine();
     
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
       // source: https://www.programmingsimplified.com/java/source-code/java-program-check-palindrome
         
      if (original.equals(reverse))
         return true;
      else

  
  return false;
 }
 /*
  * Open up  the file. 
  * Break into words 
  *  print out all Palindromes
  */
 private void findAllPalindromes(String fileName) {
  
 }
 public Palindrome() {
  //run some tests

  if (isPalindrome("racecar")) {
      System.out.print("pass");
  }
  else {
    System.out.print("Fail");
  }
  if (isPalindrome("mom")) {
     System.out.print("pass");
     }
  else {
    System.out.print("Fail");
  }
  if (isPalindrome("noon")) {
     System.out.print("pass");
     }
  else {
    System.out.print("Fail");
  }
    
   }

 public static void main(String[] args) {
  new Palindrome();

 }

}