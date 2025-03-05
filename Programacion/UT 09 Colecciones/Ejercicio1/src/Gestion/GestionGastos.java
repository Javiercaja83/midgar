package Gestion;

import CAPersona.Participante;
import Excepciones.ImportePositivoExcepcion;
import Transacciones.Gasto;
import java.util.ArrayList;
import java.util.List;

public class GestionGastos {
    private List<Participante> participantes;
    private List<ImportePositivoExcepcion> excepciones; // Almacenar excepciones

    public GestionGastos() {
        this.participantes = new ArrayList<>();
        this.excepciones = new ArrayList<>();
    }

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public double calcularTotalGastos() {
        double totalGastos = 0;

        for (Participante p : participantes) {
            for (Interfaces.CategoriaGasto t : p.get()) {
                if (t instanceof Gasto) {
                    totalGastos += -t.Monto(); // Restamos porque Gasto devuelve un monto negativo
                }
            }
        }

        return totalGastos;
    }

    public void calcularPendientes() {
        double totalGastos = calcularTotalGastos();
        double cuotaEquitativa = totalGastos / participantes.size();

        System.out.println("Total de gastos: " + totalGastos + "€");
        System.out.println("Cuota equitativa por persona: " + cuotaEquitativa + "€");

        for (Participante p : participantes) {
            try {
                double saldo = p.calcularSaldo();
                double diferencia = saldo + cuotaEquitativa; 

                if (diferencia > 0) {
                    System.out.println(p.getNombre() + " debe recibir " + diferencia + "€.");
                } else {
                    System.out.println(p.getNombre() + " debe pagar " + (-diferencia) + "€.");
                }

            } catch (ImportePositivoExcepcion e) {
                excepciones.add(e); // Guardamos la excepción en la lista
            }
        }

        // Mostrar excepciones guardadas
        if (!excepciones.isEmpty()) {
            System.out.println("\n⚠️ Excepciones registradas:");
            for (ImportePositivoExcepcion e : excepciones) {
                System.out.println(e.getMessage());
            }
        }
    }
}
