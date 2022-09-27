/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
*/
public boolean frontAgain(String str) {
  
 if(str.length() < 2){
   return false;
 }
 String first = str.substring(0,2);
  String last = str.substring(str.length()-2);
 
   return first.equals(last);
 
}
