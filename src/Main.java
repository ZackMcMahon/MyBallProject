import javax.swing.*;
import java.awt.*;
public class Main{

    public static void main(String[] args){
      System.out.println("I'm on replit!");
        JFrame myFrame = new JFrame();
       // DrawPanel myPanel = new DrawPanel();
        BallPanel ball = new BallPanel();
        myFrame.setSize(500,500);
        myFrame.add(new BallPanel());

        myFrame.setVisible(true);
    }
}