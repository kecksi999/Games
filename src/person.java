import org.newdawn.slick.*;

public class person extends BasicGame {
    private Image playerSprite;
    private float x = 400, y = 300;
    private float speed = 0.2f;

    public person() {
        super("2D Player Movement");
    }

    public person(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        playerSprite = new Image("res/player.png");
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        Input input = gc.getInput();

        if (input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {
            y -= speed * delta;
        }
        if (input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
            y += speed * delta;
        }
        if (input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {
            x -= speed * delta;
        }
        if (input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
            x += speed * delta;
        }
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        playerSprite.draw(x, y); // Zeichnet die Spielfigur
        g.drawString("Steuerung: WASD oder Pfeiltasten", 10, 30);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new Person());
            app.setDisplayMode(800, 600, false);
            app.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
