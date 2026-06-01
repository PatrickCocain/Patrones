package game;

import external.robo.EnemyRobot;

public class RobotAdapter implements Enemy {

    private EnemyRobot robot;

    public RobotAdapter(EnemyRobot robot) {
        this.robot = robot;
        this.robot.bootSequence();
    }

    @Override
    public void move() {
        robot.moveForward(1);
    }

    @Override
    public int attack(Enemy enemy) {
        int golpe = (int)(Math.random() * 10);
        robot.smash(golpe);
        return enemy.getHealth() - golpe;
    }

    @Override
    public void takeDamage(int damage) {
        robot.receiveShock(damage);
    }

    @Override
    public int getHealth() {
        return robot.energyLevel();
    }
}