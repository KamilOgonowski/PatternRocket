// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        int n = 9;

        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                    System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i+j==(n-1)/2 ||  j-i==(n-1)/2 || i==(n-1)/2 || j==0 && i>=(n-1)/2 || j==n-1 && i>=(n-1)/2 || i==3*(n-1)/4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }



//        for (int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//
//
//        for (int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//
//
//        for (int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//
//
//        for (int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//
//
//        for (int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == n - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }








    }
}