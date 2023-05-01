import java.util.Scanner;

public class Task2 {
    //метод для назначения координат 2-ух точек
    public static int[][] coordinatesMethod() {
        Scanner read = new Scanner(System.in);
        int[][] coordinates = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Введите координату " + (j + 1) + " числа " + (i + 1));
                coordinates[i][j] = read.nextInt();
            }
        }
        read.close();
        return coordinates;
    }

    public static void main(String[] args) {

        //4) Вывести длину отрезка, проходящей через две точки
        int coordinates1[][] = coordinatesMethod();
        double length = Math.sqrt(Math.pow((coordinates1[0][0] - coordinates1[1][0]), 2)
                + Math.pow((coordinates1[0][1] - coordinates1[1][1]), 2));
        System.out.println("Длина отрезка от точки 1 до точки 2 равна: " + length);

        //6) Вывести уравнение прямой, проходящей через две точки
        System.out.println("Координаната 1 -Х, а координата 2 - У");
        int coordinates2[][] = coordinatesMethod();
        // на бумаге вывел формулы для нахождения b и k в уравнении y=kx+b
        double k = (coordinates2[1][1] - coordinates2[0][1]) / (coordinates2[1][0] - coordinates2[0][0]);
        double b = coordinates2[0][1] - coordinates2[0][0] * k;
        System.out.println("y = " + k + "*x+(" + b + ")");

    }
}
