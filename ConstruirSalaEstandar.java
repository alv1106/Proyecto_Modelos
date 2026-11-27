public class ConstruirSalaEstandar extends ConstruirSala {

    @Override
    public Sala crearSala(String id, int capacidad) {
        return new SalaEstandar(id, capacidad);
    }
}