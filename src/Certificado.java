
public class Certificado implements Imprimible {

    private String numeroDocumento;

    public Certificado(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public void imprimir() {
        System.out.println("=== CERTIFICADO ===");
        System.out.println("Número de documento: " + numeroDocumento);
        System.out.println("Certificado académico impreso correctamente.");
    }
}