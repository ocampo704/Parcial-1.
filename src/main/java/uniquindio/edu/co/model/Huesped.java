package uniquindio.edu.co.model;
public class Huesped {

    private String nombre;
    private int documento;
    private String telefono;
    private String correoElectronico;
    private String procedencia;

    /**
     * metodo constructor de la clase Huesped
     * @param nombre del huesped
     * @param documento del huesped
     * @param telefono del huesped
     * @param correoElectronico del huesped
     * @param procedencia del huesped
     */
<<<<<<< HEAD:src/main/java/Huesped.java
=======

>>>>>>> origin/dev_campo704:src/main/java/uniquindio/edu/co/model/Huesped.java
    public Huesped(String nombre, int documento, String telefono,
                   String correoElectronico, String procedencia) {

        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.procedencia = procedencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Huesped{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", procedencia='" + procedencia + '\'' +
                '}';
    }
}