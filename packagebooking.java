import java.util.*;
public class PackageBooking {
    String pname;
    String CustomerName;
    String gender;
    int Age;
    int totalamt;
    PackageBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        CustomerName = sc.nextLine();
        System.out.println("Enter Your Age: ");
        Age = sc.nextInt();
        System.out.println("Gender: ");
        gender = sc.next();
        System.out.println("Enter PackageName: ");
        pname = sc.next();
    }

}
