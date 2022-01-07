package Patterns;


public class Spikey {
    public static void main(String[] args) {
        printSpikey();
        
    }
    public static void printSpikey(){
        
        int n=7;
        for(int i=1;i<=n/2;i++){
            for(int j=i;j<n/2;j++){

            System.out.print(" ");
        
            }
            for(int j=1;j<=i;j++){
                System.out.print("\\");
            }
            for(int j=1;j<=i;j++){
                System.out.print("/");
            }
            
            System.out.println();




        }
        for(int i=1;i<=n/2;i++){
            
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n/2;j++){
                System.out.print("/");
            }
            for(int j=i;j<=n/2;j++){
                System.out.print("\\");
            }

            System.out.println();
        }
        
       
        
        
    }
    
}