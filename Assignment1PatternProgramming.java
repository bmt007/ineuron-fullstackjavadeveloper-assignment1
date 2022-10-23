public class Assignment1PatternProgramming {



    public static void main(String args[]) {
        int x=10;

        System.out.println("#1. Write a program to print INEURON using pattern programming logic");
        System.out.println("");
        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {

                // printing "I"
                if (j==(x-1)/2 || i==0 || i==(x-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.print("   ");

            // printing "N"
            for (int j=0; j<x; j++) {

                if (j==0 || j== (x-1) || i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // printing "E"
            for (int j=0; j<x; j++) {

                if (j==0 || i==0 || i==(x-1)/2 || i==(x-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // printing "U"
            for (int j=0; j<x; j++) {

                if (j==0 && i<(x-1)|| i==(x-1) && j>0 && j<(x-1) || j==(x-1) && i<(x-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // printing "R"
            for (int j=0; j<x; j++) {

                if (j==0 || i==0 && j<(x-1) || j==(x-1) && i<(x-1)/2 || i==(x-1)/2 && j<(x-1) || i==j && i>(x-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // printing "O"
            for (int j=0; j<x; j++) {

                if (j==0 && i>0 && i<(x-1) || j==(x-1) && i>0 && i<(x-1) || i==0 && j>0 && j<(x-1) || i==(x-1) && j>0 && j<(x-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            // printing "N"
            for (int j=0; j<x; j++) {

                if (j==0 || i==j || j==(x-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("#2. Write a program to print the pattern");
        System.out.println("");
        x = 4;
        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {

                if (j<x) {
                    System.out.print(i+1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("#3.  Write a program to print the pattern");
        System.out.println("");
        x = 14;
        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {

                if (i==0 || i==(x-1) || j==0 || j==(x-1) || i>0 && i<(x-1)/2 && j<(x-i*2)/2 || i>0 && i<(x-1)/2 && j>(x-1)/2 && j>(x-1)/2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("#4.  Write a program to print the pattern");
        System.out.println("");
        x = 14;
        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {

                if (i>(x-1)/2 - 1 && (i==(x-1) || i==(x-2) || j==0 || j==(x-1) || i>=(j+(x-1)/2) || i>=(x-j-1+(x-1)/2)       ) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("#5.  Write a program to print the pattern");
        System.out.println("");
        x = 14;
        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {

                if (j==0 || i==0 || i==(x-1) || (j<(x-1)/2 && ( (x-1)/2 >= i + j ) || (x-1)/2 <= i - j) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
