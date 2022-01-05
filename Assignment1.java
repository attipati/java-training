package Assignments;

public class Assignment1
{
        public void add(int a,int b)
        {
        int sum=a+b;
        System.out.println("Addition of two no:" +sum);
        }
        public void sub (int a,int b)
        {
            int sub=a-b;
            System.out.println("Subtraction of two no:"+sub);
        }
        public void mul(int a,int b)
        {
            int mul=a*b;
            System.out.println("Multiplication of two no:"+mul);
        }
        public void div(int a,int b)
        {
            double div=a/b;
            System.out.println("Division of two no:"+div);
        }
        public void mod(int a,int b)
        {
            int mod=a%b;
            System.out.println("Modular division of two no:"+mod);
        }
        public static void main(String[] args)
        {
            int a=5;
            int b=2;
            Assignment1 e=new Assignment1();
            
            e.add(a,b);
            e.sub(a,b);
            e.mul(a,b);
            e.div(a,b);
            e.mod(a,b);
        }
    
    
}
