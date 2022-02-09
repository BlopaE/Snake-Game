
package game;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameFrame(){
        
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    
}