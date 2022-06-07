import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                OrangeJuice orangeJuice = new OrangeJuice();
                AppleJuice appleJuice = new AppleJuice();

                System.out.println("select 1 for apple juice instruction and 2 for orange juice instruction");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                Integer input = null;

                input = Integer.valueOf(reader.readLine());


                switch (input) {
                    case 1:
                        System.out.println(appleJuice.juice);
                        break;

                    case 2:
                        System.out.println(orangeJuice.juice);
                        break;

                    default:
                        System.out.println("please enter a valid number");

                }

            } catch (IOException e) {
                System.out.println("please enter valid number");
            } catch (NumberFormatException e) {
                System.out.println("please enter valid number");
            }
        }
    }
}