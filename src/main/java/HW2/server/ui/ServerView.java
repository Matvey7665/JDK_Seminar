package HW2.server.ui;

import HW2.server.domain.ServerController;

public interface ServerView {
    void showMassage(String massage);
    void setServerController(ServerController serverController);
}
