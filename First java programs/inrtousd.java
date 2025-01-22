import java.util.Scanner;
public class inrtousd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Indian Rupees");
        int a= sc.nextInt();
        int ans = a*84;
        System.out.println("The amount in USD is "+"$"+ans);
    }
}