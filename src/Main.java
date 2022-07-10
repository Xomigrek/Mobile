public class Main {
    public static void main(String[] args) {
        int startAccont = 5;
        int add = 1001;
        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Клиент пополнил счёт на " + add + " руб, бонус равен " + bonus + " руб, итоговая сумма на счету клиента - " + (startAccont + add + bonus));

    }
}
