public class TotalChars { 
  public static void main(String[] args) { 

    //Edit String value for user input
    String charInput = "t3St!ng Str1N666 !npu7?!?";
    System.out.println("Your string input is: " + charInput); 

    //Counts the total letters, numbers, special characters and overall total of user input
    count(charInput); } 
    
    //Method for counting the user input
    static void count(String charArr)
    { 
      char[] charArr1 = charArr.toCharArray(); 
      int letter = 0;  
      int num = 0; 
      int special = 0; 

      for(int i = 0; i < charArr.length();i++)
      { if(Character.isLetter(charArr1[i])){letter++;} 
        else if(Character.isDigit(charArr1[i])){num ++;}  
        else{special++;} 
      } 

      //Gets the total characters of the string
      int totalSum = letter + num + special;

      System.out.println("String Total Letters: " + letter); ; 
      System.out.println("String Total Numbers: " + num); 
      System.out.println("String Total Special Characters: " + special);
      System.out.println("String Total Characters: " + totalSum);
      
    } 

}
