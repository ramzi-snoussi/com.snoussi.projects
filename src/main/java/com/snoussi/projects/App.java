package com.snoussi.projects;

import com.snoussi.projects.basics.inheritance.Cat;
import com.snoussi.projects.basics.inheritance.Dog;
import com.snoussi.projects.basics.inheritance.Horse;
import com.snoussi.projects.basics.interfaces.AnimalBehaviour;
import com.snoussi.projects.basics.interfaces.AnimalCharacteristics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        App licorne = new App();
        JFrame mainFrame = new JFrame("My app");

        JButton dogButton = new JButton("Dog");
        JButton catButton = new JButton("Cat");
        final JButton horseButton = new JButton("Horse");
        dogButton.setBounds(100,10,100,20);
        catButton.setBounds(100,30,100,20);
        horseButton.setBounds(100,50,100,20);

        final AnimalBehaviour dogBehaviour = new Dog();
        final AnimalBehaviour catBehaviour = new Cat();
        final AnimalBehaviour horseBehaviour = new Horse();

        dogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(dogBehaviour.makeNoise());
                System.out.println("has brain ? : " + AnimalCharacteristics.hasBrain);

            }
        });
        catButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(catBehaviour.makeNoise());
            }
        });
        horseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(horseBehaviour.makeNoise());
            }
        });

        //mainFrame.setIconImage(ImageIO.read(licorne.getClass().getResource("icons/icons8-licorne-64.png")));
        mainFrame.setSize(300,150);
        mainFrame.add(dogButton);
        mainFrame.add(catButton);
        mainFrame.add(horseButton);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    private void lab(){

    }
}
