
/**
 * Write a description of class Mascota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mascota
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String especie;
    private int edad;
    private String raza;

    public Mascota(String nombre, String especie, int edad, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public int getEdad() {
        return edad;
    }
    public String getRaza() {
        return raza;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad + ", Raza: " + raza;
    }

    
}
