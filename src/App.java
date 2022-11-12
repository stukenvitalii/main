public class App {
    public static void main(String[] args) {
        int studentsBook = 0x38540;
        long telephoneNumber = 89136085795L;
        int lastTwoDigits = 0b1011111;
        int lastFourDigits = 013243;
        int studentsNumber = 20;
        int something = ((studentsNumber) - 1) % 26 + 1;
        char letter = 'T';
        System.out.println("Число, соответствующее номеру зачетной книжки с помощью шестнадцатеричного литерала: " + studentsBook);
        System.out.println("Число, соответствующее номеру номеру мобильного телефона с помощью десятичного литерала: " + telephoneNumber);
        System.out.println(" Число, состоящее из последних двух ненулевых цифр номера мобильного телефона при помощи двоичного литерала: " + lastTwoDigits);
        System.out.println("Число, состоящее из последних четырех ненулевых цифр номера мобильного телефона с помощью восьмеричного литерала: " + lastFourDigits);
        System.out.println("Определить увеличенное на единицу значение остатка от деления на 26 уменьшенного на единицу номера студента в журнале группы: " + something);
        System.out.println("Символ английского алфавита в верхнем регистре, номер которого соответствует найденному ранее значению: " + letter);
    }
}
