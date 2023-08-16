import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Я считаю баллы набранные абитуриентом на экзамене, введи баллы на 4 экзаменах");
            int sum = 0;
            int points;
            int countEx = 1;
            while (countEx <= 4) {
                points = scanner.nextInt();
                sum += points;
                countEx++;
            }
            System.out.println("Баллы набранные абитуриентом:" + sum);
        }catch (Exception ex){
            System.out.println("Ты ввёл что-то не так");
        }
    }
}