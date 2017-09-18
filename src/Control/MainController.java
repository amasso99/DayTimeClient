package Control;

import Control.Networkclasses.DayTimeClient;
import View.InteractionPanelHandler;

/**
 * Created by Jean-Pierre on 12.01.2017.
 */
public class MainController {

    private DayTimeClient dayTimeClient;
    private InteractionPanelHandler panelHandler;

    /**
     * Aktuell ein leerer Konstruktor.
     * Ein Objekt der Klasse MainController erstellt bei Bedarf ein Objekt der Klasse DayTimeClient. Diese Klasse muss noch geschrieben werden.
     */
    public MainController(InteractionPanelHandler panelHandler){
        this.panelHandler = panelHandler;
    }
    public MainController(){
    }

    public void setPanelHandler(InteractionPanelHandler panelHandler){
        this.panelHandler = panelHandler;
    }

    /**
     * Bei Aufruf wird ein Server angesprochen und seine Antwort als String zurückgegeben.
     * Hier muss natürlich noch die Parameterliste angemessen abgeändert werden.
     * @return
     * @param ip
     * @param port
     */
    public void getAnswer(String ip, String port){
        dayTimeClient = new DayTimeClient(ip,Integer.parseInt(port), this);
    }


    public void giveAnswer(String pMessage) {
        panelHandler.addToOutput(pMessage);
    }
}
