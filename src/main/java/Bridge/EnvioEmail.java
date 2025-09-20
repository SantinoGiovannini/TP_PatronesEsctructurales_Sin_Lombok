package Bridge;

public class EnvioEmail implements CanalEnvio {
    @Override
    public void enviar(String mensaje) {
        System.out.println(" Enviar Email: " + mensaje);

    }
}
