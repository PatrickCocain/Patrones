package game;

public class RobotGuerrero extends PersonajeBridge{

    public RobotGuerrero(Enemy accion) {
        super(accion);
    }

    @Override
    public void atacar(Enemy objetivo){
        System.out.println("Robot guerrero atacando...");
        objetivo.takeDamage(accion.attack(objetivo));
    }

}
    
