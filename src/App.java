import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;
        // Creates a new JFrame (a window) with the title "Flappy Bird".
        JFrame frame = new JFrame("Flappy Bird");
        // Makes the frame visible on the screen.
        frame.setVisible(true);
        // Sets the dimensions of the frame to the specified width (`boardWidth`) and height (`boardHeight`).
        frame.setSize(boardWidth, boardHeight);
        //Centers the frame on the screen by setting its location relative to `null`.
        frame.setLocationRelativeTo(null);
        // Prevents the user from resizing the frame.
        frame.setResizable(false);
        // Ensures that the application exits completely when the frame is closed by the user.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flappybird flappyBird = new Flappybird();
        frame.add(flappyBird);
        frame.pack();//for not including title bar
        
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
} 
