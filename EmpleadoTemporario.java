public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;
    private String genero;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + mesesContrato * 10;
    }

    public void imprimirDetalles() {
        System.out.printf("Nombre: %s\nGenero: %s\nSalario: %.2f\nHoras trabajadas: %d\nDepartamento: %s\nMeses de contrato: %d\n",
                          getNombre(), genero, calcularSalario(), getHorasTrabajadas(), getDepartamento(), mesesContrato);
    }
}