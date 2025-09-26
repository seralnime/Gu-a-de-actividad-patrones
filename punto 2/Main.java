interface Plataforma {
    void mostrar(String tipo, String mensaje);
}

class Web implements Plataforma {
    public void mostrar(String tipo, String mensaje) {
        System.out.println("[WEB - " + tipo + "]: " + mensaje);
    }
}

class Movil implements Plataforma {
    public void mostrar(String tipo, String mensaje) {
        System.out.println("[MÓVIL - " + tipo + "]: " + mensaje);
    }
}

class Escritorio implements Plataforma {
    public void mostrar(String tipo, String mensaje) {
        System.out.println("[ESCRITORIO - " + tipo + "]: " + mensaje);
    }
}

abstract class Notificacion {
    protected Plataforma plataforma;

    public Notificacion(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public abstract void enviar(String mensaje);
}

class Mensaje extends Notificacion {
    public Mensaje(Plataforma plataforma) {
        super(plataforma);
    }
    public void enviar(String mensaje) {
        plataforma.mostrar("Mensaje", mensaje);
    }
}

class Alerta extends Notificacion {
    public Alerta(Plataforma plataforma) {
        super(plataforma);
    }
    public void enviar(String mensaje) {
        plataforma.mostrar("Alerta", mensaje);
    }
}

class Advertencia extends Notificacion {
    public Advertencia(Plataforma plataforma) {
        super(plataforma);
    }
    public void enviar(String mensaje) {
        plataforma.mostrar("Advertencia", mensaje);
    }
}

class Confirmacion extends Notificacion {
    public Confirmacion(Plataforma plataforma) {
        super(plataforma);
    }
    public void enviar(String mensaje) {
        plataforma.mostrar("Confirmación", mensaje);
    }
}

public class Main {
    public static void main(String[] args) {
        Notificacion n1 = new Mensaje(new Web());
        n1.enviar("Tienes un nuevo mensaje en tu bandeja");

        Notificacion n2 = new Alerta(new Movil());
        n2.enviar("Batería baja");

        Notificacion n3 = new Advertencia(new Escritorio());
        n3.enviar("Uso de CPU muy alto");

        Notificacion n4 = new Confirmacion(new Web());
        n4.enviar("Su compra ha sido confirmada");
    }
}
