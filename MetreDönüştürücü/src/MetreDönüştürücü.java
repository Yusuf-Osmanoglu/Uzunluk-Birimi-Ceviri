import java.util.Scanner;

public class MetreDönüştürücü {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen metre cinsinden bir değer giriniz: ");
        double metre = scanner.nextDouble();
        
        double inç = metre * 39.3701;
        double fit = metre * 3.28084;
        double yarda = metre * 1.09361;
        double mil = metre / 1609.344;
        
        System.out.println(metre + " metre " + inç + " inç, " + fit + " fit, " + yarda + " yarda, ve " + mil + " mil'e eşittir.");
    }
}