package JavaCode;


import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<String>();
        
        for(int i=0; i<3; i++){
            list.add(sc.nextLine());
        }
        sc.close();

        
        for(int i=0; i<3; i++){
            System.out.println(list.get(i));
        }

    }
    
}
