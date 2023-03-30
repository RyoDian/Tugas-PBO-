import java.util.Scanner;

public class RumusABC {
    private double a, b, c, d, x1, x2;

    public RumusABC(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = b * b - 4 * a * c;

        if (d > 0) {
            this.x1 = (-b + Math.sqrt(d)) / (2 * a);
            this.x2 = (-b - Math.sqrt(d)) / (2 * a);
        } else if (d == 0) {
            this.x1 = -b / (2 * a);
            this.x2 = x1;
        } else {
            this.x1 = -b / (2 * a);
            this.x2 = Math.sqrt(-d) / (2 * a);
        }
    }

    public void printSolution() {
        if (d > 0) {
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println("x1 = " + x1 + " + " + x2 + "i");
            System.out.println("x2 = " + x1 + " - " + x2 + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = 'Y';

        while (input == 'Y') {
            System.out.print("Masukkan nilai a: ");
            double a = sc.nextDouble();

            System.out.print("Masukkan nilai b: ");
            double b = sc.nextDouble();

            System.out.print("Masukkan nilai c: ");
            double c = sc.nextDouble();

            RumusABC equation = new RumusABC(a, b, c);
            equation.printSolution();

            System.out.print("Input data lagi [Y/T]? ");
            input = sc.next().charAt(0);
        }

        System.out.println("Program selesai.");
        sc.close();
    }
}
