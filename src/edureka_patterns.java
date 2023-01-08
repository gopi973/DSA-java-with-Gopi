public class edureka_patterns {
    public static void main(String[] args) {
        pattern11(5);
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            int totalColsInRow = i + 1;
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int C = i > n ? 2 * n - i : i;
            for (int space = 0; space < n - C; space++) {
                System.out.print(" ");
            }
            for (int j = C; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = 0; j <= C; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            int C = i;
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= C; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            int C = n - i + 1;
            for (int space = 0; space < n - C; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= C; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            int C = n - i + 1;
            for (int space = 0; space < n - C; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= C; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = 0; i < 2*n; i++) {
            int C = i > n ? 2*n-i:i;
            //for (int space = 0; space < n-C; space++) {
             //   System.out.print(" ");
          //  }
            for (int j = 1; j <= C; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i = 0; i < 2*n; i++) {
            int C = i > n ? 2*n-i:i;
            for (int space = 0; space < n-C; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= C; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int i = 0; i < 2*n; i++) {
            int C = i > n ? i-n+1:i;
            for (int space = 0; space < n-C; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < C; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
