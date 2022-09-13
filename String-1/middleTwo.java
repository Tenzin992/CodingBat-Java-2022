/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/
public String middleTwo(String str) {
  String first = str.substring(0,str.length()/2);
  String last = str.substring(str.length()/2);
  return first.substring(first.length()-1) + last.substring(0,1);
  
}
