import java.util.Scanner;
public class MainFaktorial06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial06 fk = new Faktorial06();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("NIali Faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
