import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = 200;
        double distanceSwim = 0;
        Cat cat = new Cat (distanceRun, distanceSwim);

        distanceRun = 500;
        distanceSwim = 10;
        Animals dog = new Dog(distanceRun, distanceSwim);


        System.out.println("Кошка может пробежать: " + cat.getAnimalDistanceRun() +
                " м. \nСобака может пробежать: " + dog.getAnimalDistanceRun() + " м.");

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка бежит(" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака бежит(" + distance + "). Результат: " + dog.run(distance));


        System.out.println("Кошка не умеет плавать. " +
                "\nСобака может проплыть: " + dog.getAnimalDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка не умеет плавать(" + distance + "). Результат: " + cat.swim(distance));
        System.out.println("Собака плывет(" + distance + "). Результат: " + dog.swim(distance));

    }


}