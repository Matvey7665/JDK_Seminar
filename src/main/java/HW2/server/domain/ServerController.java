package HW2.server.domain;

import HW2.client.ClientController;
import HW2.client.ClientGUI;
import HW2.server.repository.Repository;
import HW2.server.ui.ServerView;
import HW2.server.ui.ServerWindow;

import java.util.ArrayList;
import java.util.List;

public class ServerController {
    private boolean work;
    private ServerView serverView;
    private List<ClientController> clientControllerList;
    private Repository<String> repository;

    public ServerController( ServerView serverView, Repository<String> repository) {

        this.serverView = serverView;
        clientControllerList = new ArrayList<>();
        this.repository = repository;
        serverView.setServerController(this);
    }
    public  void start(){
        if (work){
            showOnWindow("Сервер уже был запущен");
        }else {
            work = true;
            showOnWindow("сервер запущен");
        }
    }
    public void stop(){
        if (!work){
            showOnWindow("Сервер уже был остановлен");
        } else {
            work = false;
            while (!clientControllerList.isEmpty()){
                disconnectUser(clientControllerList.get(clientControllerList.size() - 1));
            }
            showOnWindow("Сервер остановлен!");
        }
    }
    private void showOnWindow(String text){
        serverView.showMassage(text + "\n");
    }
    public  void disconnectUser(ClientController clientController){
        clientControllerList.remove(clientController);
        if (clientController != null){
            clientController.disconnectedFromServer();
            showOnWindow(clientController.getName() + "отключился от беседы");
        }
    }
    public boolean connectUser(ClientController clientController){
        if (!work){
            return false;
        }
        clientControllerList.add(clientController);
        showOnWindow(clientController.getName() + "подключился к беседе ");
        return true;
    }
    public void message(String text){
        if (!work){
            return;
        }
        showOnWindow(text);
        answerAll(text);
        saveInHistory(text);
    }

    public String getHistory() {
        return repository.load();
    }

    private void answerAll(String text){
        for (ClientController clientController : clientControllerList){
            clientController.answerFromServer(text);
        }
    }

    private void saveInHistory(String text){
        repository.save(text);
    }
}
