import java.util.*;
public class frequency{
  private static int ch;
  public static int getC()
  {
    return ch;
  }
  public static char[] highestFreq(String str)
  {
    char c[]=str.toCharArray();
    int max=-1,k=0;
    int c1[]= new int[c.length];
    char a[] = new char[c.length];
         for(int i=0;i<c.length;i++){
          for(int j=i+1;j<c.length;j++){
            if(c[i]==c[j])
                c1[i]+=1;
               }
             if(max<c1[i])  max=c1[i];
              }
        for(int i = 0; i < c.length; i++)
        {

          if(c1[i] == max)
          {
            ch++;
           a[i] = c[i];
          }
        }
    return a;
  }
	public static void main(String[] ar){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
    char []high = highestFreq(str);
    int k = getC();

    for(int i = 0; i < k; i++)
    System.out.println("Highest frequency is of "+high[i]);
	}
}