import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import  java.lang.Character.*;

public class form {
    private JPanel panel1;
    private JButton mahoaButton;
    private JButton giaimaButton;
    private JTextField textvanban;
    private JTextField textkq;
    private JTextField textK;
    private final int mod = 26;

    public form() {
        mahoaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textvanban.getText().toUpperCase(Locale.ROOT);
                String encode ="";

                for (Character character:text.toCharArray()
                     ) {

                  if( Character.isLetter(character))
                encode=encode+endcoder(character,Integer.parseInt(textK.getText()));
                  else
                        encode=encode+character;

                }
                textkq.setText(encode);
                encode=null;
            }
        });
        giaimaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textvanban.getText().toUpperCase(Locale.ROOT);
                String decode ="";

                for (Character character:text.toCharArray()
                ) {

                    if( Character.isLetter(character))
                        decode=decode+decoder(character,Integer.parseInt(textK.getText()));
                    else
                        decode=decode+character;

                }
                textkq.setText(decode);
                decode=null;
            }
        });
    }

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
    public char endcoder (Character c, int k)
    {

        return (char) (((c-'A')+k)%mod+'A');
    }
    public char decoder (Character c, int k)
    {
        return (char) ((((c-'A')-k)%mod+mod)%mod+'A');
    }
}

