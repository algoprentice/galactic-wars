/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapnil;

/**
 *
 * @author Swapnil Jain
 */
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Game extends JFrame {
    
    public Game() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
   
        setResizable(false);
        pack();
        setSize(400, 300);
        
        setTitle("Galactic Wars");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                Game game = new Game();
                game.setVisible(true);
            }
        });
    }

}
