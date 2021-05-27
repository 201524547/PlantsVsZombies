package plant.model;

import Game.view.GamePanel;
import Lane.model.Lane;

import java.awt.*;

/**
 * Created by Armin on 6/25/2016.
 */
public abstract class Plant {

    private int health = 200;

    private int x;
    private int y;

    private Lane lane;


    public Plant(int x, int y) {
        this.x = x;
        this.y = y;
        lane = lane.getInstance();
    }

    public abstract int getPrice();

    public abstract void draw(Graphics g);

    public void stop() {
    }

    public Lane getLane() {
        return lane;
    }

    public void setLane(Lane lane) {
        this.lane = lane;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
