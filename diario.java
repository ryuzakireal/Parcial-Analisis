import java.util.ArrayList;
import java.util.List;

class informacionDiario {
    private String fecha;
    private String contenido;

    public informacionDiario(String fecha, String contenido) {
        this.fecha = fecha;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return fecha + ": " + contenido;
    }
}

class diarioPersonal {
    private List<informacionDiario> diario = new ArrayList<>();

    public void agregarEntrada(String fecha, String contenido) {
        informacionDiario nuevaEntrada = new informacionDiario(fecha, contenido);
        diario.add(nuevaEntrada);
        System.out.println("Entrada agregada: " + nuevaEntrada);
    }

    public void mostrarDiario() {
        System.out.println("Entradas del Diario:");
        for (informacionDiario entrada : diario) {
            System.out.println("- " + entrada);
        }
    }

    public void mostrarUltimasEntradas(int cantidad) {
        System.out.println("Ultimas " + cantidad + " entradas:");
        int inicio = Math.max(diario.size() - cantidad, 0);
        for (int i = diario.size() - 1; i >= inicio; i--) { 
            System.out.println("- " + diario.get(i));
        }
    }
}

public class MainDiario {
    public static void main(String[] args) {
        diarioPersonal diario = new diarioPersonal();
        diario.agregarEntrada("2024-10-31", "Hoy fue un buen dia.");
        diario.agregarEntrada("2024-11-01", "Estudie programacion en Java.");
        diario.mostrarDiario();
    }
}
