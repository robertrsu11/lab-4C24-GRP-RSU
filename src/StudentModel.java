public class StudentModel {
    private String nombre;
    private int edad;
    private String carrera;

    public StudentModel(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }
}