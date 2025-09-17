import java.util.*;
class merge
{
    public static void main(String[] args) 
    {

        String s1,s2,s3="",s4="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");  
        s1=sc.nextLine();
        System.out.println("Enter second string:");
        s2=sc.nextLine();
        if(s1.length()>=s2.length())
        {
           for(int i=0;i<s2.length();i++)
           {
               s3=s3+s1.charAt(i)+s2.charAt(i);
               s4=s1.substring(s2.length());
              
           }
        }
        else
        {
            for(int i=0;i<s1.length();i++)
        {
          s3=s3+s1.charAt(i)+s2.charAt(i);
          s4=s2.substring(s1.length());
        }
    }
         s3=s3+s4;
            System.out.println("Merged string is:"+s3);
    }
}