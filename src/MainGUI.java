import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame implements ActionListener {
    private JPanel myPanel;
    private JTextField textField1;
    private JButton calculateVertexButton;
    private JTextField textField2;
    private JTextField formulaTextField;
    private Calculate c;

    public MainGUI(Calculate c){
        createUIComponents();
        setupListeners();
        this.c =c;
    }


    public void createUIComponents(){
        setContentPane(myPanel);
        setTitle("My GUI");
        setSize(500,500);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setupListeners(){
        calculateVertexButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        JButton clickedButton=(JButton) source;
        String buttonText = clickedButton.getText();
        if(buttonText.equals("Calculate Vertex")){
            c.setFormula(textField1.getText());
            textField2.setText(c.returnV());
            }
        }

}



