import java.util.*;

class Alphabaticalorder
{
    public static void main(String[] args) 
    {
        String str,w=" ",temp=" ";

        int c,i;
        Scanner sc=new Scanner(System.in);
     
        System.out.println("Enter a string:");
        str=sc.nextLine();
        str=str.toUpperCase();
        StringTokenizer st=new StringTokenizer(str);
        c=st.countTokens();
        String arr[]=new String[c];
        for(i=0;i<c;i++)
        {
            w=st.nextToken();
            arr[i]=w;
        }
        for(i=0;i<c;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Strings in alphabetical order:");
        for(i=0;i<c;i++)
        {
            System.out.println(arr[i]);
        }

    }
}