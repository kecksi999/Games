package snowworld;

import org.newdawn.slick.*;
import java.util.ArrayList;
import java.util.List;

public class SnowWorld extends BasicGame {
    private List<Actor> actors;

    public SnowWorld() {
        super("Snow World");
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        actors = new ArrayList<>();


        for (int i = 0; i < 100; i++) {
            Snowflake.SIZE size = Snowflake.SIZE.values()[(int) (Math.random() * Snowflake.SIZE.values().length)];
            actors.add(new Snowflake(size));
        }
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        for (Actor actor : actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        for (Actor actor : actors) {
            actor.render(g);
        }
    }

    public static void main(String[] args) {
        try {
            AppGameContainer appgc = new AppGameContainer(new SnowWorld());
            appgc.setDisplayMode(800, 600, false);
            appgc.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
