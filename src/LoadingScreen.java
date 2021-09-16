import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LoadingScreen extends JFrame implements KeyListener {
    private JLabel loadingLabel;

    public LoadingScreen() {
        super("Loading");

        loadingLabel = new JLabel("Ladowanie");
        loadingLabel.setFont(new Font("", Font.BOLD, 70));

        setLayout(new GridBagLayout());
        getContentPane().setBackground(new Color(0,0,0));

        addKeyListener(this);
        
        add(loadingLabel, BoxLayout.X_AXIS);

//        setAlwaysOnTop(true);
//        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        pack();
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent evt) {

    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 113)
            biosRun();
    }

    @Override
    public void keyReleased(KeyEvent evt) {

    }

    public static void biosRun() {

    }
}
