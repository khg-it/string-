

import java.util.*;
public class divide {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      String name=scan.nextLine();
      int len=name.length();
      if(len%2!=0)
      {
        System.out.println("String is not divided into equal parts");
      }
      else
      {
        char [] arr=name.toCharArray();
        int half=len/2;
        System.out.println("FIRST PART IS: ");
        for(int i=0;i<half;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("SECOND PART IS:");
        for(int i=half;i<len;i++)
        {
            System.out.print(arr[i]);
        }
      }
    }
}
