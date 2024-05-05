package SwingLab.Prob1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 470;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 0;
    private static final int FRAME_Y_ORIGIN = 250;
    private JButton submitButton;
    private static final int BUTTON_WIDTH  = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JTextField nameInputLine;
    private JTextField streetInputLine;
    private JTextField cityInputLine;
    private JTextField stateInputLine;
    private JTextField zipInputLine;
    private JLabel name;
    private JLabel street;
    private JLabel city;
    private JLabel state;
    private JLabel zip;
    MyFrame(){
        setTitle("Address Form");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        setBackground(Color.blue);

        //changeBkColor();

        // Main panel
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        getContentPane().add(contentPane);


        // Adding the submit button
        submitButton = new JButton("Submit");
        submitButton.setBounds(170, 150, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(submitButton);

        //registering a ButtonHandler as an action listener of the two
        //ButtonHandler handler = new ButtonHandler();
        //cancelButton.addActionListener(handler);
        //okButton.addActionListener(handler);

        submitButton.addActionListener(this);

        // Adding input text field for name
        nameInputLine = new JTextField();
        nameInputLine.setBounds(20, 43, 130, 25);
        contentPane.add(nameInputLine);

        // Adding Label for name
        name = new JLabel();
        name.setText("Name");
        name.setBounds(20, 18, 40, 25);
        contentPane.add(name);

        // Adding input text field for street
        streetInputLine = new JTextField();
        streetInputLine.setBounds(170, 43, 130, 25);
        contentPane.add(streetInputLine);

        // Adding Label for street
        street = new JLabel();
        street.setText("Street");
        street.setBounds(170, 18, 40, 25);
        contentPane.add(street);

        // Adding input text field for city
        cityInputLine = new JTextField();
        cityInputLine.setBounds(320, 43, 130, 25);
        contentPane.add(cityInputLine);

        // Adding Label for city
        city = new JLabel();
        city.setText("City");
        city.setBounds(320, 18, 30, 25);
        contentPane.add(city);

        // Adding input text field for state
        stateInputLine = new JTextField();
        stateInputLine.setBounds(70, 103, 130, 25);
        contentPane.add(stateInputLine);

        // Adding Label for state
        state = new JLabel();
        state.setText("State");
        state.setBounds(70, 78, 40, 25);
        contentPane.add(state);

        // Adding input text field for zip
        zipInputLine = new JTextField();
        zipInputLine.setBounds(220, 103, 130, 25);
        contentPane.add(zipInputLine);

        // Adding Label for zip
        zip = new JLabel();
        zip.setText("Zip");
        zip.setBounds(220, 78, 30, 25);
        contentPane.add(zip);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
            JButton clickedButton = (JButton) event.getSource();
            if (clickedButton == submitButton) {
                System.out.println(nameInputLine.getText());
                System.out.println(streetInputLine.getText());
                System.out.println(cityInputLine.getText() + "," + stateInputLine.getText() + " " + zipInputLine.getText());
            }
    }
    private void changeBkColor(){
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.blue);
    }
}


