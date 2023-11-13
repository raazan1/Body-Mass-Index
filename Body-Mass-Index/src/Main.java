import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Kilonuzu Giriniz: ");
        double Kg = input.nextDouble();
        System.out.printf("Boyunuzu Metre Cinsinden Giriniz: Örnek(1,85): ");
        double Boy = input.nextDouble();
        MassIndex(Kg,Boy);

    }
    public static void MassIndex(double Kg,double Boy){
        double Mass = Kg/(Boy*Boy);
        System.out.printf("Vücut Kitle Indeksi: " + Mass);
    }
}