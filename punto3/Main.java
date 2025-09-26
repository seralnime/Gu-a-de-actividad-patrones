public class Main {
    public static void main(String[] args) {
        Mediador chatRoom = new ChatRoom();

        Usuario usuario1 = new Usuario("Ana", chatRoom);
        Usuario usuario2 = new Usuario("Carlos", chatRoom);
        Usuario usuario3 = new Usuario("Beatriz", chatRoom);
        Usuario usuario4 = new Usuario("David", chatRoom);

        chatRoom.agregarUsuario(usuario1);
        chatRoom.agregarUsuario(usuario2);
        chatRoom.agregarUsuario(usuario3);
        chatRoom.agregarUsuario(usuario4);

        System.out.println("--- Inicio de la conversación en la sala de chat ---");

        usuario1.enviar("¡Hola a todos!");

        System.out.println("\n-------------------------------------------------\n");

        usuario2.enviar("Hola Ana, ¿cómo estás?");
    }
}
