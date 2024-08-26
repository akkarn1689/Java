
/*
 * Errors:
 * 1. Compile Time error
 * 2. Runtime error (Exceptions)
 * 3. Logical error
 */

/*
 * Classed Heirarchy
 * Object -> Throwable -> [Error(Thread Death, Virtual Machine Error, IO Error), Exceptions(Runtime Exception{ also known as unchecked exceptions: Arithmatic, ArrayOutOfBounds, Null Pointer}, SQL Exception{checked exception}, IO Exception{checked exception})]
 * 
 * Checked exceptions:
 * Unchecked exceptions:
 */

/*
 * throw keyword:
 * It is used to throw a new exception
 * 
 * throws keyword: (Ducking the exception)
 * 
 */


class NewException extends Exception{
    public NewException(String str){
        super(str);
    }
}
class Exceptions {
    public static void main(String args[]) {
        int i = 2;
        int j = 0;
        int k = 0;

        int nums[] = new int[5];

        try {
            // j = 9 / i;
            if(j==0){
                throw new NewException("Some new exception");
            }
            System.out.println("j: " + j);
            System.out.println(nums[5]);
        } 
        catch(NewException ne){
            System.out.println(ne);
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

        try {
            k = 9 / i;
            System.out.println("k: " + k);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot devide zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of bounds");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("Exceptions handled");
    }
}
