package View;

import Control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jean-Pierre on 13.09.2017.
 */
public class InteractionPanelHandler {

    private MainController mainController;

    private JPanel panel;
    private JTextField serverIP;
    private JTextField serverPort;
    private JButton buttonConnect;
    private JTextArea output;

    public InteractionPanelHandler(MainController mainController) {
        this.mainController = mainController;
        createButtons();

        serverIP.setText("130.133.1.10");
        serverPort.setText("13");

        addToOutput("Willkommen beim DayTime-Client.");
        addToOutput("Tragen Sie eine IP-Adresse Ihrer Wahl samt passenden Port oben ein.");
        addToOutput("Als mögliche IP-Adressen bieten sich 130.133.1.10 (time.fu-berlin.de) oder 160.45.10.8 (zeit.fu-berlin.de) an.");
        addToOutput("Mögliche Ports sind 13 oder 37. Je nach Port wird ein anderes Protokoll aufgerufen.");
        addToOutput("-----------------------------------------------------------------------------------");
    }

    private void createButtons(){
        buttonConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Verhalten bei Knopfdruck implementieren!
                mainController.getAnswer(serverIP.getText(),serverPort.getText());
            }
        });
    }

    public JPanel getPanel(){
        return panel;
    }

    public void addToOutput(String text){
        if(output.getText().isEmpty()){
            output.setText(text);
        }else{
            output.setText(output.getText() + "\n" + text);
        }

    }
}
