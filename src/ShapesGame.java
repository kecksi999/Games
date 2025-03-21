import org.newdawn.slick.*;

public class ShapesGame extends BasicGame {
    private RectangleObject[] rectangles;
    private CircleObject[] circles;
    private EllipseObject[] ellipses;

    public ShapesGame() {
        super("Shapes Game");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        rectangles = new RectangleObject[10];
        circles = new CircleObject[10];
        ellipses = new EllipseObject[10];

        for (int i = 0; i < 10; i++) {
            boolean moveRight = (i % 2 == 0);
            rectangles[i] = new RectangleObject(100 + (i * 50), 100, 2, moveRight);
            circles[i] = new CircleObject(50 + (i * 75), 300, 20, 0.02f);
            ellipses[i] = new EllipseObject(400, 500 - (i * 30), 40, 20, -2);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (RectangleObject rect : rectangles) rect.update(delta);
        for (CircleObject circ : circles) circ.update(delta);
        for (EllipseObject elli : ellipses) elli.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (RectangleObject rect : rectangles) rect.render(graphics);
        for (CircleObject circ : circles) circ.render(graphics);
        for (EllipseObject elli : ellipses) elli.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ShapesGame());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
