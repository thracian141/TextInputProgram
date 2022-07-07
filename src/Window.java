import javax.swing.*;
import java.awt.*;

public class Window {
    static JFrame frame = new JFrame("Test Window");
    static JPanel pane = new JPanel();

    static JLabel label = new JLabel("Input here:", SwingConstants.CENTER);
    static JButton submit = new JButton("Submit");
    static JTextField textInput = new JTextField();

    public static void main(String[] args) {
        pane.setLayout(new GridLayout(3, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane();
        frame.setContentPane(pane);
        frame.setSize(960, 540);
        frame.setVisible(true);

        pane.add(label);
        label.setLocation(1, 1);
        label.setVisible(true);

        pane.add(textInput);
        textInput.setLocation(2, 1);
        textInput.setVisible(true);

        pane.add(submit);
        submit.setLocation(3, 1);
        submit.setVisible(true);
    }

}
