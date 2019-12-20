package edu.drools.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Window{

    public String askOneOutOfMany(String question, List<String> asnwers){
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(question));
        ButtonGroup group = new ButtonGroup();
        ArrayList<JRadioButton> buttons=new ArrayList<JRadioButton>();
        for (String answer : asnwers){
            JRadioButton but= new JRadioButton(answer);
            group.add(but);
            jPanel.add(but);
            buttons.add(but);
        }
        JOptionPane.showMessageDialog(null, jPanel, "OnlineGameForYou", JOptionPane.PLAIN_MESSAGE );

        for (int i=0; i<buttons.size();i++){
            if (buttons.get(i).isSelected())
                return asnwers.get(i);
        }
        return "err";
    }



    public Boolean askTrueFalse(String question){
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(question));
        ButtonGroup group = new ButtonGroup();
        JRadioButton btn1, btn2;
        btn1 = new JRadioButton("Yes");
        btn2 = new JRadioButton("No");
        group.add(btn1 );
        group.add(btn2 );
        jPanel.add(btn1);
        jPanel.add(btn2);
        JOptionPane.showMessageDialog(null, jPanel, "OnlineGameForYou", JOptionPane.PLAIN_MESSAGE);

        if (btn1.isSelected())
            return true;
        return false;
    }

}
