//receives 1 commandline argument
//creates thread and passes int and Sum object to thread
//starts thread, join stops thread, prints thread(Summation) Calculations
//

public class Driver {

    public static void main(String[] args){
        if (args.length > 0){
            if (Integer.parseInt(args[0]) < 0)
                System.err.println(args[0] + " must be >= 0");
            else {
                Sum sumObject = new Sum();
                int upper = Integer.parseInt(args[0]);
                Thread thrd = new Thread(new Summation(upper, sumObject));
                thrd.start();
                try {
                    thrd.join();
                    System.out.println("The sum of " + upper + " is " + sumObject.getSum());
										 System.out.println("The sum of " + upper + " raised to the second is " + sumObject.getSum2());
											 System.out.println("The sum of " + upper + " raised to the third is " + sumObject.getSum3());
                } catch (InterruptedException ie) {}
            }
        }
        else
            System.err.println("Usage: Summation <integer value>");
    }
}
