import java.util.Scanner;

public class GetUsername {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = InputHelper.getNonZeroLenString(scan, "Enter Your username:");
        System.out.println("The username you entered is: " + username);
    }
}
