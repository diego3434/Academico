public class ActaNotas implements Imprimible {

    private String carrera;

    public ActaNotas(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void imprimir() {
        System.out.println("=== ACTA DE NOTAS ===");
        System.out.println("Carrera: " + carrera);
        System.out.println("Acta de notas generada correctamente.");
    }
}
