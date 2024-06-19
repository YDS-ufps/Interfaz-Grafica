
/**
 * Write a description of class Veterinaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Veterinario {
    private ArrayList<Mascota> mascotas;

    public Veterinario() {
        mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void mostrarMascotas() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            for (Mascota mascota : mascotas) {
                System.out.println(mascota);
            }
        }
    }
}
