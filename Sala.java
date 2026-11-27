public abstract class Sala {

    protected String id;
    protected int capacidad;
    protected double recargo;

    public Sala(String id, int capacidad, double recargo) {
        this.id = id;
        this.capacidad = capacidad;
        this.recargo = recargo;
    }

    public abstract String getCategoria();

    public String getId() {
        return id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getRecargo() {
        return recargo;
    }
}