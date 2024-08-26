import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 
 * 
 */

class IOProcess {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter a number");
        // int num = System.in.read();
        // it gives us the ASCII value of a value, and it reads only one character at a
        // time


        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        sc.close();

    }
}
