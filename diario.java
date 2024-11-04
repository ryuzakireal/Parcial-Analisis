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
        for (informacionDiarioFecha entradaPorFecha : diarioFecha) {
            for (informacionDiarioContenido entradaPorContenido : diarioContenido) {
                System.out.println("- " + entradaPorFecha + entradaPorContenido);
            }
        for (informacionDiarioFecha entrada : diarioFecha) {
            System.out.println("- " + entrada);
        }
    }

    public void mostrarUltimasEntradas(int cantidad) {
        System.out.println("Ultimas " + cantidad + " entradas:");
        int inicio = Math.max(diario.size() - cantidad, 0);

        for (int i = diario.size() - 1; i >= inicio; i--) {

        for (int i = diario.size() - 1; i >= inicio; i--) { 

            System.out.println("- " + diario.get(i));
        }
    }
}

public class diario {
    public static void main(String[] args) {
        diarioPersonal diario = new diarioPersonal();
        diario.agregarEntradaContenido("Hoy fue un buen dia.");
        diario.agregarEntradaFecha("2024-11-01");
        diario.mostrarDiario();
    }
}