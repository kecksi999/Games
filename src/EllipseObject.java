import org.newdawn.slick.Graphics;

public class EllipseObject {
    private float x, y, width, height, speed;

    public EllipseObject(float x, float y, float width, float height, float speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void update(int delta) {
        x += speed * delta;
        if (x < 0 || x > 800) speed = -speed;
    }

    public void render(Graphics g) {
        g.drawOval(x - width / 2, y - height / 2, width, height);
    }
}
