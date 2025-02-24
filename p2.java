import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        
        sum=a+b+c;
        
        
        if(sum==180)
        {
            System.out.println("triangle is formed");
        }
        else{
            System.out.println("triangle not formed");
        }
    }
}