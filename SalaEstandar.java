public class SalaEstandar extends Sala {

    public SalaEstandar(String id, int capacidad) {
        super(id, capacidad);
    }

    @Override
    public String categoria() {
        return "ESTANDAR";
    }

    @Override
    public double recargo() {
        return 8000;
    }
}