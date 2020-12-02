import java.util.*;

public class App {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.printf("Hello, %s!\n", scanner.nextLine());
        System.out.println();

        //2
        for(int i = args.length - 1; i >= 0; i--){
            System.out.println( "Argument: " + args[i]);
        }

        //3
        Random random = new Random();
        System.out.println("\nEnter the number of random numbers");

        while(!scanner.hasNextInt()){
            System.out.println("Not a number");
            scanner.next();
        }

        int numbOfNumber = scanner.nextInt();

        for(int i = 0; i < numbOfNumber; i++) {
            System.out.print(random.nextInt(100) + " ");
        }

        System.out.println();

        for(int i = 0; i < numbOfNumber; i++) {
            System.out.println(random.nextInt(100));
        }


        //4
        int sumOfAgrsNumbers = 0;
        int multiplyOfAgrsNumbers = 1;

        for(int i = args.length - 1; i >= 0; i--){
            sumOfAgrsNumbers = sumOfAgrsNumbers + Integer.parseInt(args[i]);
            multiplyOfAgrsNumbers = multiplyOfAgrsNumbers*Integer.parseInt(args[i]);
        }

        System.out.println("\nSum of args =" + sumOfAgrsNumbers);
        System.out.println("Multiply of args =" + multiplyOfAgrsNumbers);

        //5
        System.out.println("\nEnter the number from 1 to 12");
        int month;

        while(!scanner.hasNextInt()){
            System.out.println("Not a number");
            scanner.next();
        }

        month = scanner.nextInt();

        switch (month){
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            default: System.out.println("Error! A month with this index doesn't exist!");
                break;
        }
    }
}
