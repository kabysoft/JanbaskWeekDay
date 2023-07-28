import java.util.Arrays;
import java.util.Scanner;

public class FistJavaClass {
    // this is my comment

    public static void main(String[] args) {


        /* this command have to diplay a bloc of commeny
        as dimenstrated in this example */

        System.out.println("Hello World");
        int X = 12;
        System.out.println("The value of X = "+ X) ;
        X= ++X;
        System.out.println("The value of X = "+ X) ;

        System.out.println("The value of X = "+ X--) ;
        System.out.println("The value of X = "+ X);
        System.out.println("args = " + Arrays.toString(args));
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
        System.out.println("the value i entred is   : " + a);
        Scanner sc1 = new Scanner(System.in);
        String mystring = sc1.nextLine();
        System.out.println("the value String entred is   : " + mystring);





    }
}
/**/