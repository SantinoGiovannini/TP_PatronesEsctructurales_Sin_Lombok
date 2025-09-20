package Decorador;

public class PlanBasico implements Plan {
    @Override
    public String getDescripcion() {
        return "Plan Basico";
    }

    @Override
    public double getCosto() {
        return 1000;
    }
}
