import java.util.*;
import java.util.stream.IntStream;

public class Games {

    //Game FizzBuzz
    public static void fizzBuzz() {
        System.out.println("Let's play FizzBuzz.");
        boolean sayNumber;

        for (int i = 1; i < 101; i++) {
            sayNumber = true;

            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
                sayNumber = false;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                sayNumber = false;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                sayNumber = false;
            }

            if (sayNumber) {
                System.out.println(i);
            }
        }
    }

    //Multiplications
    public static void multiplications() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("times %d \n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d \n", j, i, j * i);
            }

        }
    }

    //Caesar Chiffre
    public static void caesarChiffre() {
        //Random key to encrypt
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(25) + 1; // From 1 to 25


        //Asking for a text to encrypt
        System.out.println("Please enter your message for encryption");
        String inputWords = Scanning.scan.nextLine();

        //Encryption
        StringBuilder codedResult = new StringBuilder(); //Generated by IntelliJ with the += (Original was #String codedResult = "";)
        for (int i = 0; i < inputWords.length(); i++) {
            char character = inputWords.charAt(i);
            //Checking if char is letter
            if (Character.isLetter(character)) {
                //Create temporary variable from character
                char tempCharacter = (char) (Character.toUpperCase(character) + rndNumber); //Enter random generated number

                if (tempCharacter > 'Z') {
                    tempCharacter = (char) (tempCharacter - 26);
                }

                if (character >= 'a') {
                    tempCharacter = (char) (tempCharacter + 32);
                }

                character = tempCharacter;
            }

            codedResult.append(character); //+=
        }

        //Print encrypt text
        System.out.println("Here is your coded Text. \nCan you find the right Key?\n");
        System.out.println("---------------------------------------------------");
        System.out.println(codedResult);
        System.out.printf("Your random key %d \n", rndNumber);
        System.out.println("---------------------------------------------------\n\n");


        StringBuilder encodedResult; //Generated by IntelliJ with the += (Original was #String encodedResult;)
        //Generate number 25 to 1
        for (int i = 25; i >= 1; i--) { //From 25 to 01
            encodedResult = new StringBuilder(); //Generated by IntelliJ with the += (Original was #encodedResult = "";)

            //Decryption
            int key; //To use it outside
            for (key = 0; key < codedResult.length(); key++) {
                char character = codedResult.charAt(key);
                //Checking if char is letter
                if (Character.isLetter(character)) {
                    //Create temporary variable from character
                    char tempCharacter = (char) (Character.toUpperCase(character) + i); //i = Enter for loop number 1-26

                    if (tempCharacter > 'Z') {
                        tempCharacter = (char) (tempCharacter - 26);
                    }

                    if (character >= 'a') {
                        tempCharacter = (char) (tempCharacter + 32);
                    }

                    character = tempCharacter;
                }

                encodedResult.append(character); //+= StringBuilder?
            }

            key = 26 - i;
            System.out.println(key + "\n" + encodedResult + "\n");
        }
    }

    //Maxima calculation
    public static void maximaCalculation() {
        boolean addToList;
        int myNumber = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            addToList = false;
            System.out.println("Please enter a number or press 'q' to get the maximum");
            String myString = Scanning.scan.next();

            if (myString.equals("q") || myString.equals("Q")) {
                break;
            }

            try {
                myNumber = Integer.parseInt(myString);
                addToList = true;
            } catch (NumberFormatException NoSuchElementException) {
                System.out.println("Please enter a correct number");
            }

            if (addToList) {
                numbers.add(myNumber);
                for (int j : numbers) {
                    System.out.println(j);
                }
            }
            System.out.println("The max value is: " + Collections.max(numbers));
        }
    }

    //Bingo card generator
    public static void bingoCard() {
        Random rnd = new Random();

        int[] B = new int[5];
        int[] I = new int[5];
        int[] N = new int[4];
        int[] G = new int[5];
        int[] O = new int[5];

        boolean numberExist;

        //B
        for (int i = 0; i < B.length; i++) {
            int rndNumber = rnd.nextInt(15) + 1; // From 1 to 15

            numberExist = IntStream.of(B).anyMatch(x -> x == rndNumber);
            if (!numberExist) {
                B[i] = rndNumber;
            } else {
                i--;
            }
        }
        //I
        for (int i = 0; i < I.length; i++) {
            int rndNumber = rnd.nextInt(15) + 16; //von 16 bis 30

            numberExist = IntStream.of(I).anyMatch(x -> x == rndNumber);
            if (!numberExist) {
                I[i] = rndNumber;
            } else {
                i--;
            }
        }
        //N
        for (int i = 0; i < N.length; i++) {
            int rndNumber = rnd.nextInt(15) + 31; //von 31 bis 45
            numberExist = IntStream.of(N).anyMatch(x -> x == rndNumber);
            if (!numberExist) {
                N[i] = rndNumber;
            } else {
                i--;
            }

        }
        //G
        for (int i = 0; i < G.length; i++) {
            int rndNumber = rnd.nextInt(15) + 46; //von 46 bis 60

            numberExist = IntStream.of(G).anyMatch(x -> x == rndNumber);
            if (!numberExist) {
                G[i] = rndNumber;
            } else {
                i--;
            }
        }
        //O
        for (int i = 0; i < O.length; i++) {
            int rndNumber = rnd.nextInt(15) + 61; //von 61 bis 75

            numberExist = IntStream.of(O).anyMatch(x -> x == rndNumber);
            //IntStream.of(B).forEach(element -> System.out.println(element));
            if (!numberExist) {
                O[i] = rndNumber;
            } else {
                i--;
            }
        }

        //Print to Console
        int freeSpace;
        System.out.println("B\t|\tI\t|\tN\t|\tG\t|\tO\t|\n");

        for (int i = 0; i < 5; i++) {
            System.out.print(B[i]);
            System.out.print("\t|\t");
            System.out.print(I[i]);
            System.out.print("\t|\t");
            if (i == 2) {
                System.out.print(" ");
            } else {
                if (i > 2) {
                    freeSpace = i - 1;
                    System.out.print(N[freeSpace]);
                } else {
                    System.out.print(N[i]);
                }
            }
            System.out.print("\t|\t");
            System.out.print(G[i]);
            System.out.print("\t|\t");
            System.out.print(O[i]);
            System.out.print("\t|\n");
        }
    }

    public static void bingoCard2() {
        Random rnd = new Random();
        int[][] bingo = new int[5][5];
        boolean numberExist;
        int randomSelector = 1;

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                int rndNumber = rnd.nextInt(15) + randomSelector; //always in increments of 15

                numberExist = IntStream.of(bingo[i]).anyMatch(x -> x == rndNumber);
                if (!numberExist) {
                    bingo[i][j] = rndNumber;
                } else {
                    j--;
                }
            }
            randomSelector += 15;
        }

        int freeSpace;
        for (int i = 0; i < bingo.length; i++) {
            if (i == 0) {
                System.out.println("B\t|\tI\t|\tN\t|\tG\t|\tO\t|\n");
            }
            for (int j = 0; j < bingo[i].length; j++) {
                if (i == 2 && j == 2) {
                    System.out.print(" " + "\t|\t");
                } else {
                    System.out.print(bingo[j][i] + "\t|\t");
                }
            }
            System.out.println();
        }
    }
}