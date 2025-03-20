package org.learn.herencia.actividad602;

// Clase AppCoche para probar la implementación
public class AppEmpleados {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de empleado
        Empleado empleado = new Empleado("Juan", 1000);
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal("Maria", 1200, 6);
        EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente("Carlos", 1500, 300);

        // Mostrar los salarios calculados para cada empleado
        System.out.println("Salario de " + empleado.nombre + ": " + empleado.calcularSalarioAnual());
        System.out.println("Salario de " + empleadoTemporal.nombre + ": " + empleadoTemporal.calcularSalarioAnual());
        System.out.println("Salario de " + empleadoPermanente.nombre + ": " + empleadoPermanente.calcularSalarioAnual());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        List<Empleado> empleados = new ArrayList<Empleado>();
//        
//        empleados.add(empleado);
//        empleados.add(empleadoTemporal);
//        empleados.add(empleadoPermanente);
//        
//        for (Empleado e : empleados) {
//            System.out.println("Salario de " + e.nombre + ": " + e.calcularSalarioAnual());
//		}
        
    }
}
