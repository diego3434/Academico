public class HorarioAcademico implements Imprimible {

    private String periodoAcademico;

    public HorarioAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    @Override
    public void imprimir() {
        System.out.println("=== HORARIO ACADÉMICO ===");
        System.out.println("Período académico: " + periodoAcademico);
        System.out.println("Horario académico impreso correctamente.");
    }
}
