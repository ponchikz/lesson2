//24.04.22//
public class lesson2 {
    public static void main(String[] args) {
        System.out.println(sum(5, 55));
        isPositive(-5);
        System.out.println(isNegativ(44));
        printWordNTimes("word", 4);

    }

    /*
    �������� �����, ����������� �� ���� ��� ����� ����� � �����������, ��� �� ����� �����
    � �������� �� 10 �� 20 (������������), ���� �� � ������� true, � ��������� ������ � false
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
    �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������
    ���������� � �������, ������������� �� ����� �������� ��� �������������. ���������: ����
    ������� ������������� ������.
     */
    public static void isPositive(int x) {
        if (x >= 0) {
            System.out.println("�������������");
        } else {
            System.out.println("�������������");
        }
    }

    /*
    �������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������
    ������� true(�������), ���� ����� �������������, � ������� false(����) ���� �������������.
     */
    public static boolean isNegativ(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    /*
    �������� �����, �������� � �������� ���������� ���������� ������ � �����, ����� ������
    ���������� � ������� ��������� ������, ��������� ���������� ���
     */
    public static void printWordNTimes(String word,int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(word);
            }
    }
}

