package plant.model;

import Pea.model.NormalPea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Armin on 6/25/2016.
 */
public class Peashooter extends Plant {

    private static final int Peashooter_Price = 100;
    public Timer shootTimer;
    public Image peashooterImage;


    /**
     * gamepanel에서 lane을 불러오는 것이 아닌,
     * lane class에서 싱글톤으로 getInstance를 한다.
     */
    public Peashooter(int x, int y) {
        super(x, y);
        peashooterImage = new ImageIcon(this.getClass().getResource("../../images/plants/peashooter.gif")).getImage();
        shootTimer = new Timer(2000, (ActionEvent e) -> {
            //System.out.println("SHOOT");
            if (getLane().getLaneZombies().get(y).size() > 0) {
                getLane().getLanePeas().get(y).add(new NormalPea(y, 103 + this.getX() * 100));
            }
        });
        shootTimer.start();
    }

    @Override
    public int getPrice() {
        return Peashooter_Price;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(peashooterImage, 60 + getX() * 100,129 + 120 * getY(),null);
    }

    @Override
    public void stop() {
        shootTimer.stop();
    }

}
