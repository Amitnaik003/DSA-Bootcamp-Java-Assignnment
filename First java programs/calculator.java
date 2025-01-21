import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        if(operator== '+'){
            System.out.println("Result: "+(num1+num2));
        }
        else if(operator== '-'){
            System.out.println("Result: "+(num1-num2));
        }
        else if(operator== '/'){
            System.out.println("Result: "+(num1/num2));
        }
        else{
            System.out.println("Result: "+(num1*num2));
        }
    }
}
