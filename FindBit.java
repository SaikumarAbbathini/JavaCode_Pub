package JavaCode;

/**
 * BitManipulation
 */
public class FindBit {

    public static void main(String[] args) {
        //Taking input  (0101) o/p: 1
        int n = 5;
        
        int pos =2;
        //left shift on 1 twice
        int mask =1<<pos;

        //Printing bit present on 3 (postion is 2)
        if((n&mask)==0) System.out.println(0);
        else System.out.println(1);

    }
}