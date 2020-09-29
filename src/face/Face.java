package face;

import java.awt.Color;
import java.awt.Graphics;
public class Face {
    private int xPos, yPos, diameter;
    private Color eyeColor, headColor;
    private Graphics g;
    
    public Face(Graphics g, int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.g = g;
        this.diameter = 100;
        this.eyeColor = Color.yellow;
        this.headColor = Color.red;
    }
    
    public void draw() {
        drawHead();
        drawEyes();
        drawMouth();
    }
    
    public void drawHead() {
        g.setColor(headColor);
        g.fillOval(xPos, yPos, diameter, diameter);
    }
    
    public void drawEyes() {
        g.setColor(eyeColor);
        g.fillOval(xPos + (int) (0.2 * diameter), yPos + (int) (0.2 * diameter), (int) (diameter * 0.25), (int) (diameter * 0.25));
        g.fillOval(xPos + (int) (0.55 * diameter), yPos + (int) (0.2 * diameter), (int) (diameter * 0.25), (int) (diameter * 0.25));
    }
    
    public void drawMouth() {
        int mx = xPos + (int)(0.3 * diameter);
        int my = yPos + (int) (0.65 * diameter);
        g.setColor(Color.black);
        g.drawLine(mx, my, mx + (int)(0.4 * diameter), my);
    }
    
    public void setColor(Color eyeColor, Color headColor) {
        this.eyeColor = eyeColor;
        this.headColor = headColor;
    }
    
    public void setSize(int size) {
        this.diameter = size;
    }
    public void move(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public void erase() {
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 295);
    }
}
