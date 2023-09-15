public class Basics {
    public static void main (String[] args) {
        // Print int
        int myNum;
        myNum = 100;
        System.out.println("myNum id = " + myNum);

        // final variable
        final String dontChange = "This string will never change";
        // dontChange = "Change"; Will generate an error
        System.out.println(dontChange);

        // Declare many variables
        int a = 5, b = 10, c = 15;
        System.out.println(a + b + c);

        // One value to multiple variables
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        // Data types examples
        int aNum = 100;
        float aFloat = 1.111f;
        char aChar = 'C';
        boolean aBool = true;
        String aText = "text";

        //byte
        byte by = 127;

        //short
        short sh = 5000;

        // Java arithmetic operators examples +, -, *, /, %, ++, --

        // Strings - Special Characters
        String txt = "\\We are the so-called \"Vikings\" from the north. \\";
        System.out.println(txt);

        // Java Math
        // Math.max(), Math.sqrt(), Math.random()

        // Short Hand If...Else
        System.out.print( 2 > 1 ? "Good \n\n" : "Bad\n\n");
        String match = "two";
        switch (match) {
            case "one":
                System.out.print("One");
                break;
            case "two":
                System.out.print("Two");
                break;
            default:
                System.out.print("I am the default if no match");
        }

        int i = 10;

        while (i > 0 ) {
            System.out.print(i + ",");
            i--;
        }

        System.out.print("\n");

        do {
            System.out.print(i + ",");
            i++;
        } while (i <= 10);

        System.out.print("\n");

        // for loop
        for (i = 0; i <= 10; i++) {
            System.out.print(i + ",");
        }

        System.out.print("\n");

        // for-each exclusively loop through an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String drive : cars) {
            System.out.println(" I Drive : " + drive);
        }

        System.out.print("\n");

        // Array

        String myCars[] = {"Ferrari", "Mercedes", "BMW", "Audi"};

        for (String car: myCars
             ) {
            System.out.println(" My cars : " + car);
        }

        // Multidimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        // Print 2nd element of 2nd array = 6
        System.out.println(myNumbers[1][1]);

        System.out.print("\n");

        // Loop Through a Multi-Dimensional Array
        for (int n = 0; n < myNumbers.length; n++) {
            for (int m = 0; m < myNumbers [n].length; m ++) {
                System.out.println(myNumbers[n][m]);
            }
        }

        System.out.print("\n");

        // Bubble sort
        int[] random = {5, 7, 0, 2, 1, 9, 0} ;

        for (int k = 0; k < random.length; k++) {
            for (int l = 1; l < random.length - k; l ++ ) {
                if (random[l-1] > random[l]) {
                    int temp ;
                    temp = random[l-1];
                    random[l - 1] = random [l];
                    random [l] = temp;
                }
            }
        }

        for (int sorted : random
             ) {
            System.out.print(sorted + " ,");
        }
        System.out.print("\n");

    }
}

