public class SalaVIP extends Sala {

    public SalaVIP(String id, int capacidad) {
        super(id, capacidad);
    }

    @Override
    public String categoria() {
        return "VIP";
    }

    @Override
    public double recargo() {
        return 10000;
    }
}