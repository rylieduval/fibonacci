public class Fibonacci
{
    //the variable that will count how many times the function runs
    static int counter= 0; 
    public static void main(String args[])
    {
        //function call (looking for spot 4)
        System.out.println(Fibonacci(4));
        //print out the count
        System.out.println("Counter = " + counter);
    }
    
    public static int Fibonacci(int number)
    {
        //increase the counter by 1 every time it runs
        counter++;

        //check to see if the number is less than one, if so, work return and work its way back up
        if (number <= 1)
        {
            return number;
        }
        else 
        {
            //break down the number into the two previous numbers in the sequence
            return Fibonacci(number - 1) + Fibonacci(number - 2);
        }
    }
}
