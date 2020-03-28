/*
面试题05. 替换空格
请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */

public class Interview_05 {
  public static String replaceSpace(String s){
    if(s == null || s.length() == 0){
      return "";
    }
    StringBuilder res = new StringBuilder();
    for(int i =0; i < s.length(); i++){
      if(s.charAt(i) != ' '){
        res.append(s.charAt(i));
      }else{
        res.append("%20");
      }
    }
    return res.toString();
  }

  public static void main(String[] args){
    String s = "We are happy.";
    System.out.println(replaceSpace(s));
  }

}
