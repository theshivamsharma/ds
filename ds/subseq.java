import java.util.Scanner;
class subseq{
     static Scanner sc=new Scanner(System.in);
     static void seq(String str,String str2){
      if(str2.length()<0)
      return;

      System.out.println(str);
      for(int i=0;i<str2.length();i++)
       seq(str+str2.charAt(i),str2.substring(i+1,str2.length()));
  }


       public static void main (String args[]){
        String st=sc.nextLine();
          seq("",st);
          }
        }