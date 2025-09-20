package Decorador;
public class HDDecorador extends PlanDecorador{
    public HDDecorador(Plan plan) {
        super(plan);
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 500;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + HD ";
    }
}
