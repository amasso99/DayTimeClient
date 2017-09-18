package Control.Networkclasses;

import Control.MainController;

/**
 * Created by Jean-Pierre on 13.09.2017.
 */
public class DayTimeClient extends Client {

    private MainController mainController;

    //TODO Implementiere diese Klasse vollständig: Konstruktor, Methoden etc.
    public DayTimeClient(String pServerIP, int pServerPort, MainController mainController) {
        super(pServerIP, pServerPort);
        this.mainController = mainController;
    }

    @Override
    public void processMessage(String pMessage) {
        mainController.giveAnswer(pMessage);
    }
}
