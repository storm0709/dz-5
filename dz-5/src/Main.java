public class Main {
        public static void main(String[] args) {
            int a = 10;
            int b = 2;
            int c = 3;
            int d = 4;
            int ab = a + b;
            int cd = c + d;
            System.out.println(ab > cd);
            ++ab;
            --cd;
            --cd;
            System.out.println(ab > cd);
            String isMultipleTwo = ab % 2 != 0 && cd % 2 != 0 ? "False" : "True";
            System.out.println(isMultipleTwo);
        }
    }
