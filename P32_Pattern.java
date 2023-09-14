public class P32_Pattern {

    public static void main(String[] args) {
        pattern1(4);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern28(5);
        pattern30(5);
        pattern17(4);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int col = 1; col <= 2 * n - row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            if (row <= n) {
                for (int col = 1; col <= n - row; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int col = 1; col <= row - n; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= 2 * n - row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int c = row >= n ? 2 * n - row : row;
            for (int col = 1; col <= n - c; col++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
