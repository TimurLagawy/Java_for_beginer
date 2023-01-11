import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        System.out.print("Hello ");
        System.out.print("wor\n \t" +
                "ld");
    }
}      */

/*

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) { System.out.print(". ");

                }

                System.out.println();
 *//*Задачка
Есть сотрудник, назовем его NNNN(создаем переменную, задаем имя), он получает в месяц 400 рублей аванса и 800 рублей зарплаты.
Также он получает премию раз в квартал в размере 20 процентов от месячного дохода.
Необходимо подсчитать годовой доход сотрудника и вывести в консоль результат подсчета в формате «NNNN получает ХХХХ рублей в год.»
*//* int NNNN;
int pre_sal=400;
int sal=800;
float premium=0.2f;
        {
            System.out.println("NNNN получает " + ((pre_sal + sal) * 12 + (pre_sal + sal) * 4 * premium) + "рублей в год.");
*///ввод данных
        /*Scanner in=new Scanner(System.in);
        System.out.println("Input your name ");
        String name = in.nextLine();
        System.out.println("Input your age ");
        int age = in.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        in.close();
*/
//mini calculator
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Float num1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        Float num2 = scanner.nextFloat();

        System.out.println("Сумма составит:  " + (num1 + num2) + "\n" + "Разница составит:  " + (num1 - num2) + "\n" + "Произведение составит:" + num1 * num2 + "\n" + "Частное составит: " + num1 / num2  );
    }}
*/Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Float num1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        Float num2 = scanner.nextFloat();
        Float res1 = num1 + num2;
        Float res2 = num1 - num2;
        Float res3 = num1 * num2;
        Float res4 = num1 / num2;


        System.out.println("Сумма составит:  " + res1 + "\n" + "Разница составит:  " + res2 + "\n" + "Произведение составит:" + res3 + "\n" + "Частное составит: " + res4);
    }}
