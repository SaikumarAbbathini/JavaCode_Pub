package JavaCode;

// import java.util.Scanner;

/**
 * SetBit
 */
public class SetBit {


    // Set the 2nd bit (Position = 1) of a number n (Means if 0 make 1 and vise versa)


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        //Input

        int n=5;
        // int n = sc.nextInt();

        int pos=1;
        // int pos = sc.nextInt();

        int mask = 1<<pos;

        System.out.println(mask | n);

    }
}