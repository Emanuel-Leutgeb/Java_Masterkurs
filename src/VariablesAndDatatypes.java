import java.util.Locale;

public class VariablesAndDatatypes {

    public static void lesson1_1() {
        //Tell me about yourself
        byte age;
        String firstName;
        char sex;
        String lastName;
        String dateOfBirth;
        double grade;
        boolean married;

        age = 25;
        firstName = "Emanuel";
        sex = 'M';
        lastName = "Leutgeb";
        dateOfBirth = "27.09.1996";
        grade = 2.5;
        married = false;

        System.out.printf("Hello my name is %s %s. I'm %s years young and i was born on %s. My sex is (%s). My married status is %s and in school is my grade point average %.2f.", firstName, lastName, age, dateOfBirth, sex, married, grade );
    }

    public static void lesson1_2() {
        //Simple Calculations (Integer)
        int number1 = 25;
        int number2 = 20;

        System.out.printf("%d + %d = %d \n", number1, number2, number1 + number2);
        System.out.printf("%d - %d = %d \n", number1, number2, number1 - number2);
        System.out.printf("%d * %d = %d \n", number1, number2, number1 * number2);
        System.out.printf("%d / %d = %.2f \n", number1, number2, (double)number1 / number2);
        System.out.printf("%d %% %d = %d \n", number1, number2, number1 % number2);

        //Simple Calculations (double)
        double number3 = 25.52;
        double number4 = 20.02;

        System.out.printf("%.2f + %.2f = %.2f \n", number3, number4, number3 + number4);
        System.out.printf("%.2f - %.2f = %.2f \n", number3, number4, number3 - number4);
        System.out.printf("%.2f * %.2f = %.2f \n", number3, number4, number3 * number4);
        System.out.printf("%.2f / %.2f = %.2f \n", number3, number4, number3 / number4);
        System.out.printf("%.2f %% %.2f = %.2f \n", number3, number4, number3 % number4);
    }

    public static void lesson1_3(){
        //Working with Strings
        String helloWorld = " Hello World! ";
        System.out.println(helloWorld + " contains " + helloWorld.length() + " letters.");
        System.out.println(helloWorld.toUpperCase());
        System.out.println(helloWorld.toLowerCase());
        System.out.println(helloWorld.replace("World", "Codersbay"));
        System.out.println(helloWorld.trim());
        for(int i = 1; i <= 15; i++){
            System.out.println(helloWorld + i);
        }
    }
}
