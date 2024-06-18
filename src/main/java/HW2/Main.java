package HW2;

import HW2.client.ClientController;
import HW2.client.ClientGUI;
import HW2.server.domain.ServerController;
import HW2.server.repository.FileStrorage;
import HW2.server.ui.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerController serverController = new ServerController(new ServerWindow(), new FileStrorage());

        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }

}
