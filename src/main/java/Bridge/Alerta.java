package Bridge;

public class Alerta extends Notificacion {
    public Alerta(CanalEnvio canal) {
        super(canal);

    }

    @Override
    public void enviar(String mensaje){
        canal.enviar(" [ALERTA] " + mensaje);
    }
}
