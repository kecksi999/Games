package snowworld;

import org.newdawn.slick.Graphics;
import java.util.Random;

public class Snowflake implements Actor {
    public enum SIZE {BIG, SMALL, MEDIUM}
    private float x, y;
    private int speed;
    private Random random;
    private int size;

    public Snowflake(SIZE size) {
        random = new Random();
        this.x = random.nextFloat() * 800;
        this.y = random.nextFloat() * -600;

        switch (size) {
            case BIG:
                this.speed = 60;
                this.size = 15;
                break;
            case MEDIUM:
                this.speed = 40;
                this.size = 10;
                break;
            case SMALL:
                this.speed = 20;
                this.size = 5;
                break;
        }
    }

    @Override
    public void update(int delta) {
        y += speed * (delta / 1000.0f);
        if (y > 600) {
            y = random.nextFloat() * -600;
            x = random.nextFloat() * 800;
        }
    }

    @Override
    public void render(Graphics g) {
        g.fillOval((int) x, (int) y, size, size);
    }
}
