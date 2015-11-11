package club.enlight.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class MainMenu extends State {
    public MainMenu(){
        super();
    }

    Texture texture;

    SpriteBatch batch;
    float x, y;


    @Override
    public void onCreate() {
        Random rand = new Random();
        batch = new SpriteBatch();
        texture = new Texture("Doge/Dog.jpg");

        x = rand.nextFloat() * 1000.f;
        y = rand.nextFloat() * 1000.f;
    }

    @Override
    public void onDraw(float dt) {
        batch.begin();
        batch.draw(texture, x, y);
        batch.end();
    }

    @Override
    public void onUpdate(float dt) {
        x += 600.f * dt;
        y += 600.f * dt;

        if (x > Gdx.graphics.getWidth()) {
            x = 0.f;
        }

        if (y > Gdx.graphics.getHeight()) {
            y = 0.f;
        }
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }
}
