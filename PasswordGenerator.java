import java.util.Scanner;
public class PasswordGenerator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";
System.out.print("Enter password length: ");
int length = sc.nextInt();
String password = "";
for(int i = 0; i < length; i++) {
int index = (int)(Math.random() * chars.length());
password = password + chars.charAt(index);
}
System.out.println("Generated Password: " + password);
sc.close();
}
}