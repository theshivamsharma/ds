import java.util.*;
class toggle{

  static Scanner s = new Scanner(System.in);
   public static String toggleStr(String str)
   {
    char a[] = str.toCharArray();
      for(int i = 0; i < a.length; i++){
          if(Character.isUpperCase(a[i])){
                a[i] = Character.toLowerCase(a[i]);
             }
             else
               a[i] = Character.toUpperCase(a[i]);
          }
        String st=new String(a);
        return st;
   }
   public static void main(String args[]){
      String str = s.nextLine();
      String st = toggleStr(str);
      System.out.println(st);
       }
}