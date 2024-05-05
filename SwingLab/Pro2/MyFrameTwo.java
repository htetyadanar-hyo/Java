package SwingLab.Pro2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

public class MyFrameTwo extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 0;
    private static final int FRAME_Y_ORIGIN = 250;
    private JButton countButton;
    private JButton reverseButton;
    private JButton removeButton;
    private JTextField inputLine;
    private JTextField outputLine;
    private static final int BUTTON_WIDTH = 130; // Added missing constant for button width
    private static final int BUTTON_HEIGHT = 25;

    private JLabel input;
    private JLabel output;
    MyFrameTwo(){
        setTitle("String Utility");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        setBackground(Color.blue);

        //changeBkColor();

        // Main panel
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        getContentPane().add(contentPane);


        // Adding the count button
        countButton = new JButton("Count Letters");
        countButton.setBounds(20, 43, BUTTON_WIDTH, BUTTON_HEIGHT); // Adjusted bounds
        contentPane.add(countButton);
        countButton.addActionListener(this);

        // Adding the reverse button
        reverseButton = new JButton("Reverse Letters");
        reverseButton.setBounds(20, 90, BUTTON_WIDTH, BUTTON_HEIGHT); // Adjusted bounds
        contentPane.add(reverseButton);
        reverseButton.addActionListener(this);

        // Adding the remove button
        removeButton = new JButton("Remove Duplicates");
        removeButton.setBounds(20, 137, BUTTON_WIDTH, BUTTON_HEIGHT); // Adjusted bounds
        contentPane.add(removeButton);
        removeButton.addActionListener(this);

        // Adding input text field for input
        inputLine = new JTextField();
        inputLine.setBounds(200, 70, 130, 25); // Adjusted bounds
        contentPane.add(inputLine);

        // Adding Label for input
        input = new JLabel();
        input.setText("Input");
        input.setBounds(200, 50, 40, 25); // Adjusted bounds
        contentPane.add(input);

        // Adding input text field for output
        outputLine = new JTextField();
        outputLine.setBounds(200, 120, 130, 25); // Adjusted bounds
        contentPane.add(outputLine);

        // Adding Label for street
        output = new JLabel();
        output.setText("Output");
        output.setBounds(200, 100, 60, 25); // Adjusted bounds
        contentPane.add(output);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
            JButton clickedButton = (JButton) event.getSource();
            if (clickedButton == countButton) {
                outputLine.setText(count(inputLine.getText()));
            }
            else if(clickedButton == reverseButton){
                outputLine.setText(reverse(inputLine.getText()));
            }
            else{
                outputLine.setText(removeDuplicate(inputLine.getText()));
            }
    }
    private void changeBkColor(){
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.blue);
    }

    private String count(String s){
        return s.length() + "";
    }

    private String reverse(String s){
        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            str.append(s.charAt(i) + "");
        }
        return str.toString();
    }

    private String removeDuplicate(String s) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}


