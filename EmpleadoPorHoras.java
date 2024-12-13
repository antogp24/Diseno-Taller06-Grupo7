public class EmpleadoPorHoras extends Empleado {
    private String genero;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        this.genero = genero;
    }

    @Override
    public double calcularSalario() {
        return getHorasTrabajadas() * getTarifaHora();
    }

    public void imprimirDetalles() {
        System.out.printf("Nombre: %s\nGenero: %s\nSalario: %.2f\nHoras trabajadas: %d\nDepartamento: %s\n",
                          getNombre(), genero, calcularSalario(), getHorasTrabajadas(), getDepartamento());
    }
}