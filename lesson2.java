//24.04.22//
public class lesson2 {
    public static void main(String[] args) {
        System.out.println(sum(5, 55));
        isPositive(-5);
        System.out.println(isNegativ(44));
        printWordNTimes("word", 4);

    }

    /*
    Ќаписать метод, принимающий на вход два целых числа и провер€ющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да Ц вернуть true, в противном случае Ц false
     */
    public static boolean sum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Ќаписать метод, которому в качестве параметра передаетс€ целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. «амечание: ноль
    считаем положительным числом.
     */
    public static void isPositive(int x) {
        if (x >= 0) {
            System.out.println("ѕоложительное");
        } else {
            System.out.println("ќтрицательное");
        }
    }

    /*
    Ќаписать метод, которому в качестве параметра передаетс€ целое число. ћетод должен
    вернуть true(»стинна), если число отрицательное, и вернуть false(Ћожь) если положительное.
     */
    public static boolean isNegativ(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    /*
    Ќаписать метод, которому в качестве аргументов передаетс€ строка и число, метод должен
    отпечатать в консоль указанную строку, указанное количество раз
     */
    public static void printWordNTimes(String word,int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(word);
            }
    }
}

