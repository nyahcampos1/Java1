import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class java_I_assignment {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //1
        String name;

        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.println("Your name is: " + name.toUpperCase());

        //2
        String string = "";
        int upperCase = 0;
        System.out.print("Please enter a string: ");
        string = keyboard.nextLine();
        for (int k = 0; k < string.length(); k++) {
            // Check for uppercase letters.
            if (Character.isUpperCase(string.charAt(k)))
            {upperCase++; }

        }

        System.out.printf("There are %d uppercase letters.",upperCase);

        //3
        String string1 = "";
        String caps = null;

        System.out.print("Please enter a string: ");
        string1 = keyboard.nextLine();
        String[] string2 = string1.split(" ");
        for (int k = 0; k < string2.length; k++) {
            // Check for uppercase letters.
            if (k % 2 == 0) {
                caps = string2[k].toUpperCase();
            } else {
                string2[k].toLowerCase();
            }
        }
        System.out.print(caps);


        //4
        java_I_assignment pn = new java_I_assignment();

        String test = " ";
        System.out.print("Enter a string: ");
        test = keyboard.nextLine();

        if (pn.isPalindrome(test)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public boolean isPalindrome(String original) {
        int i = original.length() - 1;
        int j = 0;
        while (i > j) {
            if (original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }


    //5
    String input = " ";
    boolean quit;
    do
    {
        System.out.print("Enter a string: ");
        input = keyboard.nextLine();
        int vowelCount = 0;
        int consCount = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
            || input.charAt(i) == 'u')
            {
                vowelCount++;
            }
            if (!(input.charAt(i) == 'a') || !(input.charAt(i) == 'e') || !(input.charAt(i) == 'i') || !(input.charAt(i) == 'o')
                    || !(input.charAt(i) == 'u') || !(input.charAt(i) == ' '))
            {
                consCount++;
            }

        }
        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of consonants: " + consCount);
    }
    while (!input.equals("quit"));


    //6
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Enter two numbers to add: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);


        //7

        int num1 = 0;
        int num2 = 0;
        String operation = " ";
        int sum = 0;
        double quotient = 0.0;
        int difference = 0;
        int product = 0;

        System.out.println("Enter two numbers: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        System.out.println("Enter operation you would like to do (addition, subtraction, multiplication, division): ");
        operation = keyboard.next();
        if (operation.equals("addition"))
        {
            sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }
        else if (operation.equals("subtraction"))
        {
            difference = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + difference);
        }
        else if (operation.equals("multiplication"))
        {
            product = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + product);
        }
        else if (operation.equals("division"))
        {
            quotient = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + quotient);
        }



        //8
        double price = 0.0;
        double totalPrice = 0.0;
        String width = " ";
        String length = " ";
        int width1 = 0;
        int length1 = 0;

        System.out.println("Enter the price of the carpet per square foot: ");
        price = keyboard.nextDouble();
        do
        {
            System.out.println("Enter the width and length(respectively) of the room: ");
            width = keyboard.next();
            length = keyboard.next();
            width1 = Integer.parseInt(width);
            length1 = Integer.parseInt(length);
            totalPrice = length1 * width1 * price;
            System.out.println("The total price of the carpet installation is: " + totalPrice);
        }
        while (!(width.equals("done")) || !(length.equals("done")));


        //9
        int guess = 0;
        Random num = new Random();
        int randNum = num.nextInt(5);

        do {
            System.out.println("Guess the random number: ");

            guess = keyboard.nextInt();
            if (randNum == guess) {
                System.out.println("You guessed it!!!");
            } else {
                System.out.println("Try again...");
            }
        }
        while (!(randNum == guess));


        //10
    String phrase = " ";
    System.out.println("Enter a string: ");
    phrase = keyboard.nextLine();
    String[] string2 = phrase.split(" ");
    for (String string2a: string2) {
        String space = " ";
        for (int i = 0; i < string2a.length(); i++) {
            System.out.println(space + string2a.charAt(i));
            space =+ " ";
        }
    }




    }
}