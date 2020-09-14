/**
 * Created by bdamadi on 9/14/20.
 */

import java.util.*;
public class HelloWorld {
    // program begins with a call to main().
    // Prints "Hello, Babak" to the terminal window.
    public static void main(String args[]) {
        //check if name is entered
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else
            System.out.println("Please enter your name");
    }
}