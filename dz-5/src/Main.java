public class Main {
        public static void main(String[] args) {
//1. Надає значення 4 полям типу int.
            int a = 10;
            int b = 2;
            int c = 3;
            int d = 4;
//2. Сумує їх попарно.
            int ab = a + b;
            int cd = c + d;
//3. Виводить результат порівняння сум (true, якщо перша сума більша).
            System.out.println(ab > cd);
//4. Збільшує першу суму на 1.
            ++ab;
//5. Другу суму зменшує на 2.
            --cd;
            --cd;
//6. Виводить результат порівняння (true якщо перша сума більша).
            System.out.println(ab > cd);
//7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.
            String isMultipleTwo = ab % 2 == 0 || cd % 2 == 0 ? "True" : "False";
            System.out.println(isMultipleTwo);
        }
    }
