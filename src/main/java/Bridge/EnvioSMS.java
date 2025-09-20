package Bridge;

public class EnvioSMS implements CanalEnvio {
    @Override
    public void enviar(String mensaje) {
        System.out.println(" Envio SMS: " + mensaje);
    }
}
