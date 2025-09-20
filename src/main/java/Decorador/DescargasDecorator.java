package Decorador;

public class DescargasDecorator extends PlanDecorador{
    public DescargasDecorator(Plan plan) {
        super(plan);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Descargas Offline ";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 700;
    }
}
