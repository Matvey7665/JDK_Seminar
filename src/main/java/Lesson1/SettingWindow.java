package Lesson1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {
    private static final int WIDTH = 230;
    private static final int HEIGHT = 350;
    private int CURRENT_SIZE;

    JButton btnStart;
    private  JPanel createModPanel(){
        Label typeOfGame = new Label("Выберите режим игры");
        JRadioButton peopleToBot = new JRadioButton("Человек против компьютера");
        JRadioButton peopleToPeople = new JRadioButton("Человек против человека");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(peopleToBot);
        buttonGroup.add(peopleToPeople);
        JPanel panel = new JPanel(new GridLayout(3,1));
        panel.add(typeOfGame);
        panel.add(peopleToBot);
        panel.add(peopleToPeople);
        return panel;
    }
    private  JPanel fieldSizePanel(){
        Label sizeField = new Label("Выберите размер поля");
        Label currenSizeWin = new Label("Установленный размер: " + CURRENT_SIZE);
        JSlider jSlider = new JSlider(3,10,5);
        jSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                CURRENT_SIZE = jSlider.getValue();
                currenSizeWin.setText("Установленный размер: " + CURRENT_SIZE);

            }
        });
        JPanel jPanel = new JPanel(new GridLayout(3,1));
        jPanel.add(sizeField);
        jPanel.add(currenSizeWin);
        jPanel.add(jSlider);



        return jPanel;
    }
    private  JPanel winLenPanel(){
        Label lenWin = new Label("Выберите длину для победы");
        Label currenLenWin = new Label("Установленная длина: " + CURRENT_SIZE);
        JSlider jslider = new JSlider(3,10,5);
        jslider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                CURRENT_SIZE= jslider.getValue();
                currenLenWin.setText("Установленная длина: " + CURRENT_SIZE);
            }
        });
        JPanel jPanel = new JPanel(new GridLayout(3,1));
        jPanel.add(lenWin);
        jPanel.add(currenLenWin);
        jPanel.add(jslider);

        return jPanel;
    }



    SettingWindow(GameWindow gameWindow){
        btnStart = new JButton("Start new game");
        JPanel panel = new JPanel(new GridLayout(3,1));
        panel.add(createModPanel());
        panel.add(fieldSizePanel());
        panel.add(winLenPanel());

        setLocationRelativeTo(gameWindow);
        setSize(WIDTH, HEIGHT);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                gameWindow.startNewGame(0, 3, 3, 3);
            }
        });

        add(panel);
        add(btnStart,BorderLayout.SOUTH);
    }
}
