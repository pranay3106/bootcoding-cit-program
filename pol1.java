public class pol1
{
    public static void main(String[] args) 
{
int a =2;
int num= a;
int reverse= 0;
while(a>0)
{
 int remainder = a%10;
reverse = (reverse*10)+remainder;
a=a/10;
}
if(num == reverse)    
{
System.out.println(num+" is palindrone number");
}
else
{
System.out.println(num+" is not palindrone number");
}
}
} 
