import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class BallPanel extends JPanel{
Ball b = new Ball();


    Ball noel;
    public BallPanel(){
        setBackground(Color.RED);
        setFocusable(true);
        noel = new Ball();
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int key = e.getKeyCode();
                if(key == 68){
                    b.moveRight();
                }
                else if (key == 87){
                    b.moveUp();
                }
                else if(key == 65){
                    b.moveLeft();
                }
                else if( key == 83){
                    b.moveDown();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }


        });

    }

@Override
    protected void paintComponent(Graphics z){
        super.paintComponent(z);
        b.drawBall(z);
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();

    }


}