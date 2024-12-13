public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoAnual;
    }

    public void imprimirDetalles() {
        System.out.printf("Nombre: %s\nGenero: %s\nSalario: %.2f\nHoras trabajadas: %d\nDepartamento: %s\nBono anual: %.2f\n",
                          getNombre(), genero, calcularSalario(), getHorasTrabajadas(), getDepartamento(), bonoAnual);
    }
}
