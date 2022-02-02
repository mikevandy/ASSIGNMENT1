//receives an int and the Sum object and contains critical section for thread
//Summation takes the int and runs the summation formula for i, i squared, and//i raised to the third. Saves results in Sum Object.
//

public class Summation implements Runnable{
    private int upper;
    private Sum sumValue;
    public Summation(int upper, Sum sumValue){
        this.upper = upper;
        this.sumValue = sumValue;
    }
    public void run() {
        int sum = 0; int sum2 = 0; int sum3 = 0;
        for(int i=0; i<= upper; i++){
            sum += i; 
						sum2 += (i*i);
						sum3 += (i*i*i);
				}
        sumValue.setSum(sum);
				sumValue.setSum2(sum2);
				sumValue.setSum3(sum3);


    }
}
