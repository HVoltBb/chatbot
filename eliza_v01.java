import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class eliza_v01 {
    private static String sad (String x){
        Date t = new Date();
        Random rand = new Random(t.getTime());
        String rep = x.replaceFirst(".*(?:I|i)(?:'| a)m (depressed|sad)\\s*.*", (rand.nextInt(10) <= 5)? "I am sorry to hear you are $1" : "Why do you think you are $1\\?");
        if(!rep.equals(x)) {
            return rep;
        } else {
            return "";
        }
    }

    private static String happy (String x){
        Date t = new Date();
        Random rand = new Random(t.getTime());
        String rep = x.replaceFirst(".*(?:I|i)(?:'| a)m (happy|glad)\\s*.*", (rand.nextInt(10) <= 5)? "I'm glad that you are $1" : "Why do you think you are $1\\?");
        if(!rep.equals(x)) {
            return rep;
        } else {
            return "";
        }
    }

    public static void main(String[] shit){
        Scanner input = new Scanner(System.in);
        System.out.println("Type 'Quit' when you want to quit.");
        System.out.println("Say something");
        String x = input.nextLine();
        String rep;

        while(!x.equals("Quit")) {
            rep = sad(x);
            if(!rep.isEmpty()) {
                System.out.println(rep);
            } else {
                rep = happy(x);
                if (!rep.isEmpty()) {
                System.out.println(rep);
            } else {
                System.out.println("I am sorry I don't understand you.\nWhat else do you want to say?");
            }
            }

            x = input.nextLine();
        }
    }
}
