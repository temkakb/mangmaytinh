import javax.swing.*;

public class form {
    private JPanel panel1;
    private JButton mahoaButton;
    private JButton giaimaButton;
    private JTextField textvanban;
    private JTextField textkq;
    private JTextField textK;

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
    public static void main (String [] args){
        JFrame form = new JFrame("Ceasar");
        form.setContentPane(new form().panel1);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.pack();
        form.setVisible(true);
    }
}
