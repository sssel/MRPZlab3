import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Створення абонента.");
        System.out.println("Введіть номер: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        Subscriber subscriber = new Subscriber(number, new Check(0));
        Subscriber[] subscribers = new Subscriber[1];
        subscribers[0] = subscriber;


        Administrator administrator = new Administrator(subscribers);
        System.out.println(administrator.subscribers[0].toString());
        System.out.println("Введіть, на скільки треба поповнити рахунок?");
        administrator.subscribers[0].payCheck(in.nextDouble());
        System.out.println(administrator.subscribers[0].toString());
        System.out.println("Розмова по телефону. Скільки хвилин ви розмовляли?");
        administrator.subscribers[0].talkedOfMinutes(in.nextInt());
        System.out.println(administrator.subscribers[0].toString());
        System.out.println("Ви зателефонували адміністратору. Бажаєте змінити номер. Введіть новий номер: ");
        administrator.changeNumber(0, in.nextInt());
        System.out.println(administrator.subscribers[0].toString());
        System.out.println("Ви вирішили поставити музику на гудок.");
        administrator.subscribers[0].use1Service();
        System.out.println(administrator.subscribers[0].toString());
        administrator.disableSubscriber(0);
        System.out.println("Адміністратор відключив вас за несплату");
    }
}