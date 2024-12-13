public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private double tarifaHora;

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
    }

    public double calcularSalario() {
        validarValores();
        return salarioBase + calcularHorasExtra() + calcularBonificacionPorDepartamento();
    }

    private void validarValores() {
        if (salarioBase < 0) throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        if (horasTrabajadas < 0) throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
    }

    private double calcularHorasExtra() {
        final int HORAS_SEMANALES = 40;
        final double TARIFA_EXTRA = 50;
        return horasTrabajadas > HORAS_SEMANALES ? (horasTrabajadas - HORAS_SEMANALES) * TARIFA_EXTRA : 0;
    }

    private double calcularBonificacionPorDepartamento() {
        switch (departamento) {
            case "Sistemas": return 20;
            case "Contabilidad": return 10;
            default: return 0;
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    public int getHorasTrabajadas() { return horasTrabajadas; }
    public void setHorasTrabajadas(int horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }
    public double getTarifaHora() { return tarifaHora; }
    public void setTarifaHora(double tarifaHora) { this.tarifaHora = tarifaHora; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
}
