public class SalaEstandar extends Sala {

    public SalaEstandar(String id, int capacidad) {
        super(id, capacidad, 0);
    }

    @Override
    public String getCategoria() {
        return "ESTANDAR";
    }
}