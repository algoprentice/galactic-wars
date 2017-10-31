/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapnil;

import java.util.ArrayList;

/**
 *
 * @author Swapnil Jain
 */
public class Boss extends Sprite {
    
    private final int INITIAL_X = 400;
    private int direction = 0; //0 - up && 1 - down;
    private long timeOfPreviousAlien = System.currentTimeMillis();
    private int health;
    
    public Boss(int x, int y) {
        super(x, y);
        initBoss();
    }
   
    private void initBoss() {
        health = 100;
        loadImage("images/boss.jpg");
        getImageDimensions();
    }
    
    public void move() {
        if(direction == 0) {
            y += -1;
            if(y < 1) {
                y = 1;
                direction = 1;
            } 
        } else {
            y += 1;
            if(y > 250) {
                y = 250;
                direction = 0;
            }
        }
    }
    
    public void fire(ArrayList<Alien> aliens) {
        long timeOfCurrentAlien = System.currentTimeMillis();
        
        if(timeOfCurrentAlien - timeOfPreviousAlien < 1000) {
            return;
        }
        timeOfPreviousAlien = timeOfCurrentAlien;
        aliens.add(new Alien(x, y));
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int bossHealth) {
        this.health = bossHealth;
    }
    
    public boolean isDead() {
        return (health <= 0);
    }
}
