package Decorador;

public class UltraHDDecorador extends PlanDecorador{
    public UltraHDDecorador(Plan plan) {
        super(plan);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + UltraHD ";

    }
    @Override
    public double getCosto() {
        return plan.getCosto() + 1000;
    }
}
