package JavaCode;

public class ClearBit {


    // Clear the 3rd bit (Position = 2) of a number n (Make it 0)

    public static void main(String[] args) {
    
         // Scanner sc = new Scanner(System.in);

        //Input

        int n=5;
        // int n = sc.nextInt();

        int pos=2;
        // int pos = sc.nextInt();

        int mask = ~(1<<pos);

        int op = n & mask;

        System.out.println(op);



        

    }
    
}
