/*

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*/
public String withoutX(String str) {
  if (str.length() == 1 || str.equals("")){
    return "";
  }else if(str.substring(0,1).equals("x")&&str.substring(str.length()-1).equals("x")){
    return str.substring(1,str.length()-1);
  }else if (str.substring(0,1).equals("x")){
    return str.substring(1);
  }else if (str.substring(str.length()-1).equals("x")){
    return str.substring(0,str.length()-1);
  }
  else {
    return str;
  }
}
