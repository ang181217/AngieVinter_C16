package co.com.ps.c12;

public enum Enum {

    Mensaje("La suma de todos los números es: ");
    private final String mensaje;

    Enum (String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }
}
