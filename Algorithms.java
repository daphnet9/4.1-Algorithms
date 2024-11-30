import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twos = twos();
        int greaterThan = greaterThan();
        // int greatest = greatest();
        // int least = least();
        // int sum = sum();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twos);
        System.out.println(greaterThan);
        // System.out.println(greatest);
        // System.out.println(least);
        // System.out.println(sum);
        s.close();
    }

    public static int odds() throws FileNotFoundException {
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException {
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twos() throws FileNotFoundException {
        s = new Scanner(f);
        int twos = 0;
        while (s.hasNext()) {
            if (s.nextInt() == 2)
                twos++;
        }
        return twos;
    }

    public static int greaterThan() throws FileNotFoundException {
        s = new Scanner(f);
        int greaterThan = 0;
        while (s.hasNext()) {
            if (s.nextInt() >= 500)
                greaterThan++;
        }
        return greaterThan;
    }
}