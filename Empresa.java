import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public List<Empleado> obtenerEmpleadosPorHorasTrabajadasAPartirDe(int horas) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getHorasTrabajadas() > horas) {
                resultado.add(empleado);
            }
        }
        return resultado;
    }
}


