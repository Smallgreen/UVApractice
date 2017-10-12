import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int resArr[] = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.fill(resArr, -1);

            String keyboard = "1234567890-=WERTYUIOP[]\\SDFGHJKL;'XCVBNM,./";

        while (sc.hasNext()) {

                String n = sc.nextLine();

            for (char c: n.toCharArray()){


                for(int i = 0; i < keyboard.length(); i++){


                if(c ==' '){
                    System.out.print(" ");
                break;
            }
            else{

                if(c == 'W'){
                    System.out.print('Q');
                    break;
                }
                else if(c == 'S'){
                    System.out.print('A');
                    break;
                }
                else if(c == 'X'){
                    System.out.print('Z');
                    break;
                }
                else if(c == '1'){
                    System.out.print('`');
                    break;
                }

                    char a = keyboard.charAt(i);

                    if(c == a){
                        c = keyboard.charAt(i-1);

                         System.out.print(c);
                         break;
                    }
                }


                }

                
    }
    System.out.println();

}

}
}
