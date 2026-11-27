public class SalaVip extends Sala {

    public SalaVip(String id, int capacidad) {
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