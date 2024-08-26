import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TryCatchFinally {
    public static void main(String[] args) throws IOException {
        int num = 0;
        System.out.println("Enter a number");

        // Method 1:
        // try{
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);
        // num = Integer.parseInt(br.readLine());
        // System.out.println(num);
        //     br.close();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("Close resources here!");
        // }

        // Method 2:

        // BufferedReader br = null;
        // try{
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(in);
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     br.close();
        // }


        // try with resources
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }    
}
