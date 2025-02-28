import org.newdawn.slick.Graphics;

public class Rectangle {
    private int x, y;
    private float speed;

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(int delta) {
        this.x += delta / this.speed;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 100, 100);
    }
}
