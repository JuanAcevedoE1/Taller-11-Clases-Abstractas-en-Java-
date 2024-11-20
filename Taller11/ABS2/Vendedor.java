package Taller11.ABS2;

public class Vendedor extends Empleado {
    private double ventas;
    private double comision;

    public Vendedor(String nombre, double ventas, double comision) {
        super(nombre);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return 1500 + (ventas * comision); // Salario base + comisiones
    }
}
