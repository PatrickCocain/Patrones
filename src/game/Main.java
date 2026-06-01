package game;

import external.robo.EnemyRobot;

public class Main {
    public static void main(String[] args) {
        
        // Personaje normal
        Enemy enemy1 = new Player();
        Enemy enemy2 = new Player();

        // Adapter: adaptamos EnemyRobot para que funcione como Enemy
        EnemyRobot robotBase = new EnemyRobot();
        Enemy robotEnemy = new RobotAdapter(robotBase);

        // Bridge: conectamos el robot adaptado con la lógica de ataque
        PersonajeBridge guerrero = new RobotGuerrero(robotEnemy);

        // Jugabilidad: enemy1 le quita vida a enemy2
        enemy2.takeDamage(enemy1.attack(enemy2));
        System.out.println("Vida de enemy2 tras ataque de enemy1: " + enemy2.getHealth());

        // Jugabilidad: el robot le quita vida a enemy2
        guerrero.atacar(enemy2);
        System.out.println("Vida de enemy2 tras ataque del robot: " + enemy2.getHealth());
    }
}