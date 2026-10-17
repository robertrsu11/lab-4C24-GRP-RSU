public class StudentReport {

    public void generarReporte(StudentModel estudiante) {
        System.out.println("===== REPORTE DEL ESTUDIANTE =====");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Estado: Matriculado");
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        StudentModel estudiante = new StudentModel(
            "Robert Silva Ullilen",
            54,
            "Diseño y Desarrollo de Software"
        );

        StudentReport reporte = new StudentReport();
        reporte.generarReporte(estudiante);
    }
}System.out.println("Institución: TECSUP");