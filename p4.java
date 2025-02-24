import java.util.Scanner;
class Size
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         
         switch(size)
         {
             case 30:
            
                 System.out.println("size is medium");
                 break;
                 
             case 38:
                 System.out.println("size is large");
                 break;
             case 42:
                 System.out.println("size is Xlarge");
                 break;
             default:
                 System.out.println(" invalid size");
                 break;
                 
         }
    }
}