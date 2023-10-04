import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    /**
     * Die Klasse Gui implementiert die grafische Oberfläche. Sie erbt aus der importierten Klasse JFrame.
     */


    // Konstruktor, der die Rahmenbedingungen der grafischen Oberfläche festlegt.
    public Gui() {
        super("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(CommonConstants.FRAME_SIZE);
        setBackground(CommonConstants.BACKGROUND_COLOR);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        addGuiComponents();

    }


    private void addGuiComponents() {
        JPanel jPanel = new JPanel();
        jPanel.setVisible(true);
        jPanel.setSize(CommonConstants.PANEL_SIZE);
//      jPanel.setLayout(null);
//      setLocationRelativeTo(null);
//      jPanel.setBackground(Color.red);
        setBackground(CommonConstants.BACKGROUND_COLOR);

    }


}
