package JavaCode;

public class UpdateBit {



    // Update the 2nd bit (Position = 1) of a number n to 1

    public static void main(String[] args) {
    
        // Scanner sc = new Scanner(System.in);

       //Input

       int n=5;
       // int n = sc.nextInt();

       int pos=1;
       // int pos = sc.nextInt();

       int mask = 1<<pos;

       int op;

       if((mask&n)==0){
        op = n|mask;
        System.out.println(op);
       }
       else {
        int notMask = ~mask;
        op = notMask&n;
        System.out.println(op);
       }



       

   }

    
}
