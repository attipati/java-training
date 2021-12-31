import java.util.Scanner;  
public class Assignment2  
{  
public static void main(String[] args)   
{  

int a, b, c, largest;  

Scanner sc = new Scanner(System.in);  
  
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
largest = ((a>b)&&(a>c)?a:(b>c)?b:c);
System.out.println("The largest number is: "+largest);  
}  
}  
