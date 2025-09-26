public class Usuario {
    private String nombre;
    private Mediador mediador;

    public Usuario(String nombre, Mediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public String getNombre() {
        return nombre;
    }

    public void enviar(String mensaje) {
        System.out.println(this.nombre + " envía: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    public void recibir(String mensaje) {
        System.out.println(this.nombre + " recibe: " + mensaje);
    }
}
