package Bridge;

public class Promocion extends Notificacion{
    public Promocion(CanalEnvio canal){
        super(canal);
    }

    @Override
    public void enviar(String mensaje){
        canal.enviar(" [PROMOCION] " + mensaje);
    }
}
