package Decorador;

abstract class PlanDecorador implements Plan {
    protected Plan plan;

    public PlanDecorador(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String getDescripcion() {
        return plan.getDescripcion();
    }

    @Override
    public double getCosto() {
        return plan.getCosto();
    }


}
