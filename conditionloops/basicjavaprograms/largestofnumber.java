import java.util.Scanner;
public class largestofnumber{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int l=0;
    int n= sc.nextInt();
    while(n!=0){
        if(n>l){
            l=n; 
        }
        n= sc.nextInt();
        
    }System.out.println("Largest number is: "+l);
    }
}
