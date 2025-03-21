import org.newdawn.slick.Graphics;

public class CircleObject {
    private float x, y, radius, growthRate;

    public CircleObject(float x, float y, float radius, float growthRate) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.growthRate = growthRate;
    }

    public void update(int delta) {
        radius += growthRate * delta;
        if (radius > 50) radius = 20;
    }

    public void render(Graphics g) {
        g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
