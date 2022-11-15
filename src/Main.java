import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Проектная работа №1");
        System.out.print("Введите имя: ");
        String ownerName = in.nextLine();
        System.out.print("Введите номер телефона: ");
        String  number = in.nextLine();
        System.out.print("Модель телефона: ");
        String model = in.nextLine();
        System.out.print("Вес телефона: ");
        double weight = in.nextDouble();
        System.out.print("ОС телефона: ");
        String os = in.next();
        System.out.print("Объём памяти телефона: ");
        int memory = in.nextInt();
        String text = "!";
        System.out.println(" ");

        ///////////////////////////////////////////////////////////////////////

        Phone1 ph1 = new Phone1(ownerName, number, model, weight, os, memory);
        System.out.println(" ");
        Phone1 ph2 = new Phone1(ownerName, number, model);
        System.out.println(" ");
        Phone1 ph3 = new Phone1();
        System.out.println(" ");

        Phone2 phone = new Phone2(); // подкласс класса Phone1 - работает
        phone.answer_the_call();

        ///////////////////////////////////////////////////////////////////////

        ph1.output_variables();
        ph1.receive_call(ownerName);
        ph1.get_number(number);
        ph1.answer_the_call();
        ph1.send_messages(ownerName);
        ph1.get_info(ownerName, model, os);
        ph1.receive_call_ext(number, ownerName);
        ph1.sendMessage(number, text);
        System.out.println(" ");

        ///////////////////////////////////////////////////////////////////////

        ph2.output_variables();
        ph2.receive_call(ownerName);
        ph2.get_number(number);
        ph2.answer_the_call();
        ph2.send_messages(ownerName);
        ph2.get_info(ownerName, model, os);
        ph2.receive_call_ext(number, ownerName);
        ph2.sendMessage(number, text);
        System.out.println(" ");

        ///////////////////////////////////////////////////////////////////////

        ph3.output_variables();
        ph3.receive_call(ownerName);
        ph3.get_number(number);
        ph3.answer_the_call();
        ph3.send_messages(ownerName);
        ph3.get_info(ownerName, model, os);
        ph3.receive_call_ext(number, ownerName);
        ph3.sendMessage(number, text);
        System.out.println(" ");
    }
}