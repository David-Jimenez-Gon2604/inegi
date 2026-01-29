import java.util.Scanner;

public class inegi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hombres = 0, mujeres = 0;

        int hNino = 0, hAdolecente = 0, hJoven = 0, hAdulto = 0, hTercera = 0;
        int mNina = 0, mAdolecente = 0, mJoven = 0, mAdulto = 0, mTercera = 0;
        String genero;
        int edad;

        while (true) {
            System.out.print("Ingrese genero (H/M) o s para salir: ");
            genero = sc.nextLine();

            if (genero.equals("S")) {
                break;
            }
            System.out.print("Ingrese edad: ");
            edad = sc.nextInt();
            sc.nextLine();

            if (genero.equals("H")) {
                hombres++;

                if (edad <= 15) {
                    hNino++;
                } else if (edad <= 20) {
                    hAdolecente++;
                } else if (edad <= 30) {
                    hJoven++;
                } else if (edad <= 60) {
                    hAdulto++;
                } else {
                    hTercera++;
                }

            } else if (genero.equals("M")) {
                mujeres++;

                if (edad <= 15) {
                    mNina++;
                } else if (edad <= 20) {
                    mAdolecente++;
                } else if (edad <= 30) {
                    mJoven++;
                } else if (edad <= 60) {
                    mAdulto++;
                } else {
                    mTercera++;
                }
            }
            System.out.println("Registro guardado");
        }
        System.out.println(" RESUMEN FINAL ");
        System.out.println("Genero: Hombre (" + hombres + " registrados)");
        System.out.println("Niños: " + hNino);
        System.out.println("Adolescentes: " + hAdolecente);
        System.out.println("Adulto joven: " + hJoven);
        System.out.println("Adultos: " + hAdulto);
        System.out.println("Tercera edad: " + hTercera);

        System.out.println("Genero: Mujer (" + mujeres + " registrados)");
        System.out.println("Niñas: " + mNina);
        System.out.println("Adolescentes: " + mAdolecente);
        System.out.println("Adulta joven: " + mJoven);
        System.out.println("Adultas: " + mAdulto);
        System.out.println("Tercera edad: " + mTercera);
        sc.close();
    }
}