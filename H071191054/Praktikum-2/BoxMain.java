import java.util.Scanner;

public class BoxMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double width = inp.nextDouble();
        double height = inp.nextDouble();
        double depth = inp.nextDouble();
        double mass = inp.nextDouble();

        Box box = new Box(width, height, depth);
        box.setMass(mass);
        System.out.println("Massa jenis = " + box.getDensity());

        box.setMass(mass * 2);
        System.out.println("Massa jenis = " + box.getDensity());
        inp.close();
    }
}