public class Main {
    public static void main(String[] args) {
        int initialAccount = 300;
        int depositAmounts = 1200;
        int bonus;

        /* int limit = 1000;
        с доп. переменной на предел, но можно обойтись простым сравнением с 1000 */

        /* boolean limit = depositAmounts > 1000;
           if (limit) {
             далее схожий алгоритм вычисления */

        /* boolean limit = depositiAmounts > 1000
         int somethingNew = limit ? true : false;   - c исп. тернарного оператора */

        if (depositAmounts > 1000) {
            bonus = depositAmounts / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = initialAccount + depositAmounts + bonus;
        System.out.println("Ваш счет с учётом бонуса: " + totalAmount);
    }
}

/* С использованием класса Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи изначальную сумму: ");
        int initialAccount = sc.nextInt();
        System.out.println("Введи сумму депозита: ");
        int depositAmounts = sc.nextInt();
        int bonus;

        if (depositAmounts > 1000) {
            bonus = depositAmounts / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = initialAccount + depositAmounts + bonus;
        System.out.println("Ваш счет с учётом бонуса: " + totalAmount);
*/