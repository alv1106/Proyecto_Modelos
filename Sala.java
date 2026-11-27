public abstract class Sala {

    protected String id;
    protected int capacidad;
    protected double recargo;

    public Sala(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    public abstract String categoria();
    public abstract double recargo();

    public String getId() {
        return id;
    }

    public int getCapacidad() {
        return capacidad;
    }


}