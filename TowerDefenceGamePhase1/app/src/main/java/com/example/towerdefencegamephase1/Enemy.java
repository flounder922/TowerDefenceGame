package com.example.towerdefencegamephase1;

import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;

public class Enemy extends GameObject {

    private int nextTurn = 1;
    private int speed = 10;

    public Enemy(float startingX, float startingY, Bitmap enemyBitmap){
        location = new Position();
        location.x = startingX;
        location.y = startingY;
        this.objectBitmap = enemyBitmap;
    }


    public int getNextTurn(){
        return nextTurn;
    }

    public void setNextTurn(int nextTurn){
        this.nextTurn = nextTurn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setPosition(Position newPosition){
        this.location.x = newPosition.x;
        this.location.y = newPosition.y;
    }

    public Position getLocationOnMap(){
        return location;
    }


}
