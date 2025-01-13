import java.util.Scanner;
public class hcflcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int temp=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                temp=i;
            }
        }
        System.out.println("HCF of the Number "+a+" and "+ b +" is: "+temp);
        int lcm = (a*b)/temp;
        System.out.println("LCM of the Number "+ a +" and "+ b +" is: "+lcm);
    } 
}
