import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n= sc.nextInt();
        int c= n;
        while(n>0){
            int r=n%10;
            int s=(s*10)*r;
            n=n/10;
        }
        if(c==s){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
}
}

