package dominio;

public class Habitantes {
    private String nombre;
    private String apellido1;
    private String apellido2;

    //Constructores
    public Habitantes () {}
    public Habitantes (String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    //Métodos
        //Setters
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1 (String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2 (String apellido2) {
        this.apellido2 = apellido2;
    }

        //Getters
    public String getNombre () {
        return (nombre);
    }

    public String getApellido1 () {
        return (apellido1);
    }

    public String getApellido2 () {
        return (apellido2);
    }

    public String toString () {
	return ("Nombre: " + nombre + " " + apellido1 + " " + apellido2);
    }
}
