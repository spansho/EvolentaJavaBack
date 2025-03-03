import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {

        long sum =getArithmeticProgressionSum(10000000,1000000000);
        System.out.println(sum);
    }
    public static long getArithmeticProgressionSum(int a,int b)
    {
        LongStream stream=LongStream.range(a,b);
        return stream.reduce(0L,(acc,n)->{
            if(n!=b)
                acc+=n;
            return acc;
        });
    }
}