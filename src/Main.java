import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World !");

        // Data types

        int var1 = 10;
        double var2 = 5.5;
        String var3 = "Hello World";

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

        // Operators

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);

        int var4 = 4;
        System.out.println(var4++);
        System.out.println(var4);

        // Conditionals
        // If ... Else statement

        if (var1 > 10) {
            System.out.println("Too much!");
        } else if (var1 < 10) {
            System.out.println("Too little!");
        } else  {
            System.out.println("Just right!");
        }

        // Switch statement

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                            case 5:
                                System.out.println("Friday");
                                break;
            default:
                System.out.println("Weekend");
                break;
        }

        // Ternary operators

        String result = day < 6 ? "Weekend" : "Weekend";
        System.out.println(result);


        int x = 10;
        int y = 20;
        System.out.println(x > y ? "x is greater" : "y is greater");


        // String methods

        String word = "Hello";

        System.out.println(word + " World!");
        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());


        // Arrays

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);


        int[] numbers = { 4, 2, 7};
        Arrays.sort(numbers);
        String results = Arrays.toString(numbers);
        System.out.println(results);


         // For Loop

        String[] names = {"Cristina", "Paul", "Maria", "John"};

        for (int i=0; i< names.length; i++) {
            System.out.println(names[i]);
        }

        // For each loop

        for (String name : names) {
            System.out.println(name);
        }

        // While loop

        int i =0;
        while(i < names.length) {
            System.out.println(names[i++]);
        }

        // do while Loop

        i = 0;
        do {
            System.out.println(names[i++]);
        } while(i < names.length);

    }
}