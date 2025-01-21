import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name that you want to greeat:");
        String name= sc.nextLine();
        System.out.println("Hello! "+name+" it's a warm welcome you here");
    }
}
