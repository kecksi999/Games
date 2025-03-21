import org.newdawn.slick.Graphics;

public class RectangleObject {
    private float x, y, speed;
    private boolean moveRight;

    public RectangleObject(float x, float y, float speed, boolean moveRight) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.moveRight = moveRight;
    }

    public void update(int delta) {
        if (moveRight) {
            x += speed * delta;
            if (x > 800) x = 0;
        } else {
            x -= speed * delta;
            if (x < 0) x = 800;
        }
    }

    public void render(Graphics g) {
        g.drawRect(x, y, 30, 30);
    }
}
