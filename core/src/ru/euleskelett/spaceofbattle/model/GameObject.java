package ru.euleskelett.spaceofbattle.model;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Polygon;


 abstract class GameObject {

     Polygon bouds;
     Sprite object;
     GameObject(TextureRegion textureRegion, float x, float y, float width, float height){
        bouds = new Polygon( new float[]{0f, 0f, width, 0f, width, height, 0f, height});
        bouds.setPosition(x, y);
        bouds.setOrigin(width/2f, height/2f);

        object = new Sprite(textureRegion);
        object.setSize(width, height);
        object.setPosition(x, y);
        object.setOrigin(width/2f, height/2f);
    }
    public void draw(SpriteBatch batch){
        object.setPosition(bouds.getX(), bouds.getY());
        object.setRotation(bouds.getRotation());
        object.draw(batch);
    }

    public Polygon getBouds() {
        return bouds;
    }
}
