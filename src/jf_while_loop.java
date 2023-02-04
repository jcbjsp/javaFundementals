public class jf_while_loop {
    public static void main(String[] args) {
        int counter =0;
        while (counter < 10) {
            if (counter % 2 == 0)
                System.out.println("Counter: " + counter);
            else
                System.out.println("Number is odd");
            counter ++; // increment
            //counter += 1; // counter + 1
            // counter = counter + 1;
        }

    }
}


