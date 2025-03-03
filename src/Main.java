import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        StudentWithClock studentWithClock=new StudentWithClock();
        studentWithClock.learn();
    }



    public interface Learner {
        void learn();
    }

    public interface CurrentTime
    {
        String showCurrentTime();
    }

    public static class StudentWithClock implements Learner,CurrentTime {
        @Override
        public void learn() {
            System.out.println("Я учусь. .zZ");
            IntStream.range(0, 1000000).forEach(i -> Math.log(i));
            System.out.println("Я закончил учиться");
            System.out.println("Текущее время " + showCurrentTime());
        }

        @Override
        public String showCurrentTime()
        {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.currentTimeMillis();
            return sdf.format(cal.getTime()).toString();
        }
    }
}