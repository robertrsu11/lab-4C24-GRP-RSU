public class StudentView {

    public void mostrarEstudiante(StudentModel estudiante) {
        System.out.println("===== DATOS DEL ESTUDIANTE =====");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("================================");
    }
}