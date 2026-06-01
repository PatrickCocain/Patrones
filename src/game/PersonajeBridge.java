package game;


public abstract class PersonajeBridge {
    protected Enemy accion;
    
    public PersonajeBridge(Enemy accion){
        this.accion=accion;
    }
    public abstract void atacar(Enemy objetivo);
}