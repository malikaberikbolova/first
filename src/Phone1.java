import java.util.Scanner;

public class Phone1 { // #1
    Scanner in = new Scanner(System.in);
    private String number; // номер телефона
    private String model;
    private String ownerName;
    private double weight;
    private String os; // операционная система
    private int memory;
    private int ram; // Оперативная память
    private int megapixel_camera; // кол-во МП камеры
    String text;

    void output_variables() { // #3
        this.number = number; // номер телефона
        this.model = model;
        this.ownerName = ownerName;
        this.weight = weight;
        this.os = os; // операционная система
        this.memory = memory;
        this.ram = ram; // Оперативная память
        this.megapixel_camera = megapixel_camera; // кол-во МП камеры
        System.out.println("Значения и типы переменных класса 'Phone1': ");
        System.out.println("int " + number);
        System.out.println("String " + model);
        System.out.println("String " + ownerName);
        System.out.println("double " + weight);
        System.out.println("String " + os);
        System.out.println("String " + memory);
        System.out.println("int " + ram);
        System.out.println("int " + megapixel_camera);
        System.out.println(" ");
    }

    // #4 - 5 methods
    void receive_call (String callerName) {
        this.ownerName = callerName;
        System.out.println("Звонит " + callerName + "...");
    }

    void get_number (String number) {
        this.number = number;
        System.out.println(number);
    }

    void answer_the_call () {
        System.out.println("Принять - 1, отклонить - 0");
        int answer = in.nextInt();
        if (answer == 1) {
            System.out.println("Вызов принят");
            System.out.println(" ");
        }
        else if (answer == 0) {
            System.out.println("Вызов отклонен");
            System.out.println(" ");
        }
        else {
            System.out.println("Ошибка!");
            System.out.println(" ");
        }
    }

    void get_info (String ownerName, String model, String os) {
        this.model = model;
        this.ownerName = ownerName;
        this.os = os; // операционная система
        System.out.println("Данные: " + ownerName + " - " + model + " - " + os);
        System.out.println(" ");
    }

    void send_messages (String fromWho) {
        this.ownerName = fromWho;
        System.out.println("Сообщение");
        System.out.print("Текст сообщения: ");
        String text = in.nextLine();
        System.out.println("Текст сообщения: " + text);
        System.out.println("Сообщение отправлено");
        System.out.println(" ");
    }

    public Phone1 (String ownerName1, String number1, String model1) { // #6
        this.number = number1; // номер телефона
        this.model = model1;
        this.ownerName = ownerName1;
        System.out.println("Phone1: " + ownerName1 + "; " + number1 + "; " + model1 + ".");
    }

    public Phone1 (String ownerName, String number, String model, double weight, String os, int memory) { // #5
        this(number, model, ownerName); // #8
        // this.number = number; // номер телефона
        //this.model = model;
        //this.ownerName = ownerName;
        this.weight = weight;
        this.os = os; // операционная система
        this.memory = memory;
        System.out.println("Phone1: " + ownerName + "; " + model + "; " + weight + "; " + os + "; " + memory + ".");
    }

    public Phone1 () { // #7
     ownerName = "Felix";
     number = "87076543223";
     model = "Iphone";
    }

    void receive_call_ext (String number, String callerName) { // #9
        this.number = number;
        this.ownerName = callerName;
        System.out.println("...Входящий звонок...");
        System.out.println(callerName);
        System.out.println(number);
        System.out.println(" ");
    }

    void sendMessage (String number, String text) {
        System.out.println("Сообщение");
        this.number = number;
        this.text = text;
        System.out.println("Номер телефона: " + number);
        System.out.print("Напишите текст сообщения: ");
        text = in.nextLine();
        System.out.println("Текст сообщения: " + text);
        System.out.println("Сообщение отправлено");
        new Phone1().receiveMessage(text);
        System.out.println(" ");
    }

    void receiveMessage (String text) {
        this.text = text;
        System.out.println("Текст сообщения: " + text);
        System.out.println("Сообщение отправлено");
        System.out.println(" ");
    }

}
