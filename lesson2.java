public class lesson2 {
    public static void main(String[] args) {
        System.out.println(sum(5, 15));
        isPositive(0);
        System.out.println(isNegativ(1));
    }
    /*
    Ќаписать метод, принимающий на вход два целых числа и провер€ющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да Ц вернуть true, в противном случае Ц false
     */
    public static boolean sum (int a, int b) {
        int sum = a + b;
        if (sum >=10 && sum <=20) {
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
    public static void isPositive (int x) {
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
    public static boolean isNegativ (int x) {
        if (x < 0) {
            return true;
        }
            return false;
    }
}
