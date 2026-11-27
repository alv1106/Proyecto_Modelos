public class ConstruirSalaVip extends ConstruirSala {

    @Override
    public Sala crearSala(String id, int capacidad) {
        return new SalaVip(id, capacidad);
    }
}