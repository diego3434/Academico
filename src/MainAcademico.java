import java.util.Scanner;

public class MainAcademico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de documento del certificado: ");
        String numeroDocumento = scanner.nextLine();

        System.out.print("Ingrese la carrera del acta de notas: ");
        String carrera = scanner.nextLine();


        System.out.print("Ingrese el período académico: ");
        String periodo = scanner.nextLine();


        Certificado certificado = new Certificado(numeroDocumento);
        ActaNotas acta = new ActaNotas(carrera);
        HorarioAcademico horario = new HorarioAcademico(periodo);

        System.out.println("\n----- IMPRESIÓN DE DOCUMENTOS -----\n");


        certificado.imprimir();
        System.out.println();

        acta.imprimir();
        System.out.println();

        horario.imprimir();

        scanner.close();
    }
}