import java.util.ArrayList;

public class gastosPrueba {

	public static void main(String[] args) {
		controlGastos control = new controlGastos();
		System.out.println("\nAgregar gastos");
        control.agregargasto("Cena", 25.50, "Comida", "Tarjeta");
        control.agregargasto("Postre", 10.50, "Comida", "Efectivo");
        control.agregargasto("Transporte", 10.00, "Transporte", "Efectivo");
        
        System.out.println("\nMostrar gastos");
        control.mostrargastos();
        
        System.out.println("\nListar gastos");
        control.listarGastos();
        
        System.out.println("\nEstablecer presupuesto");
        control.establecerPresupuesto(5000);
        
        System.out.println("\nNotificación"+ "\n" + control.notificacionPresupuesto());
        
        System.out.println("\nBuscar gasto por palabra clave <Transporte>");
        ArrayList<gasto> res = control.buscarporpalabraclave("Transporte");
        for (gasto gasto : res) {
			System.out.println(gasto);
		}

	}

}
