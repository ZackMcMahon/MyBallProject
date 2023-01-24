import javax.swing.*;
import java.awt.*;
public class Ball {
    private int x = 50;
    private int y = 50;
    private int size = 100;
    private int xSpeed = 50;
    private int ySpeed = 50;
    public Ball(){

    }

    public void drawBall(Graphics f){
        f.fillOval(x,y,size,size);


    }

    public void moveBall(){
        x+=xSpeed;
        x+=ySpeed;
    }
public void  moveRight(){
        x+=10;
}
public void moveUp(){
        y-=10;
}
public void moveDown(){
        y+=10;
}
public void moveLeft(){
     x-=10;
    }

}

