public class Fibonacci
{
    static int counter= 0; 
    public static void main(String args[])
    {
        System.out.println(Fibonacci(4));
        System.out.println("Counter = " + counter);
    }
    
    public static int Fibonacci(int number)
    {
        counter++;
        
        if (number <= 1)
        {
            return number;
        }
        else 
        {
            return Fibonacci(number - 1) + Fibonacci(number - 2);
        }
    }
}