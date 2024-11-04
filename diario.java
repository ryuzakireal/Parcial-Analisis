import java.util.ArrayList;
import java.util.List;

class informacionDiarioContenido {
    private String contenido;

    public informacionDiarioContenido(String contenido) {

        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return contenido;
    }
}

class informacionDiarioFecha {
    private String fecha;

    public informacionDiarioFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return fecha;
    }
}

class diarioPersonal {
    private List<informacionDiarioContenido> diarioContenido = new ArrayList<>();
    private List<informacionDiarioFecha> diarioFecha = new ArrayList<>();

    public void agregarEntradaContenido(String contenido) {
        informacionDiarioContenido nuevaEntrada = new informacionDiarioContenido(contenido);
        diarioContenido.add(nuevaEntrada);
        System.out.println("Entrada agregada: " + nuevaEntrada);
    }

    public void agregarEntradaFecha(String fecha) {
        informacionDiarioFecha nuevaEntrada = new informacionDiarioFecha(fecha);
        diarioFecha.add(nuevaEntrada);
        System.out.println("Entrada agregada: " + nuevaEntrada);
    }

    public void mostrarDiario() {
        System.out.println("Entradas del Diario:");
        for (informacionDiarioFecha entradaFechas : diarioFecha) {
            for (informacionDiarioContenido entradaContenidos : diarioContenido) {
                System.out.println("- " + entradaContenidos);
            }
        }
    }
}

public class diario {
    public static void main(String[] args) {
        diarioPersonal diario = new diarioPersonal();
        diario.agregarEntradaFecha("2024-10-31");
        diario.agregarEntradaContenido("Estudie programacion en Java.");
        diario.mostrarDiario();
    }
}
