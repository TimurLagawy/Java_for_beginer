import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;

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
*/ int NNNN;
int pre_sal=400;
int sal=800;
float premium=0.2f;
        {
            System.out.println("NNNN получает " + ((pre_sal + sal) * 12 + (pre_sal + sal) * 4 * premium) + "рублей в год.");

        }
    }
}