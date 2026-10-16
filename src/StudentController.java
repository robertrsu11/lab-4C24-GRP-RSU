public class StudentController {

    private StudentModel modelo;
    private StudentView vista;

    public StudentController(StudentModel modelo, StudentView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.mostrarEstudiante(modelo);
    }

    public static void main(String[] args) {
        StudentModel estudiante = new StudentModel(
            "Robert Silva Ullilen",
            54,
            "Diseño y Desarrollo de Software"
        );

        StudentView vista = new StudentView();

        StudentController controlador =
            new StudentController(estudiante, vista);

        controlador.actualizarVista();
    }
}