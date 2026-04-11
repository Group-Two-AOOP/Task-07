package org.example;

import javax.swing.*;
import java.awt.*;

public class WorkingWithTabbedPanes {
    JFrame frame;
    JTabbedPane tabbedPane;
    JPanel homePanel,formPanel,dashboardPanel,settingsPanel,aboutPanel;

    public WorkingWithTabbedPanes() {
        this.CreateFrame();
    }

    public JFrame CreateFrame() {
        frame = new JFrame("Working With Tabbed Panes");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add TabbedPane to Frame
        frame.add(this.CreateTabbedPane());

        frame.setVisible(true);
        return frame;
    }

    public JTabbedPane CreateTabbedPane() {
        tabbedPane = new JTabbedPane();

        homePanel = new JPanel();
        homePanel.add(new JLabel("Welcome to the Home Tab"));

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3, 2));

        formPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        formPanel.add(emailField);


        JButton submitBtn = new JButton("Submit");
        formPanel.add(submitBtn);

        dashboardPanel = new JPanel();
        dashboardPanel.add(new JLabel("Dashboard Data Display"));


        settingsPanel = new JPanel();
        settingsPanel.add(new JCheckBox("Enable Notifications"));
        settingsPanel.add(new JCheckBox("Dark Mode"));


        aboutPanel = new JPanel();
        aboutPanel.add(new JLabel("This is a Java Swing Tabbed Application"));

        // Add Tabs to TabbedPane
        tabbedPane.addTab("Home", homePanel);
        tabbedPane.addTab("Form", formPanel);
        tabbedPane.addTab("Dashboard", dashboardPanel);
        tabbedPane.addTab("Settings", settingsPanel);
        tabbedPane.addTab("About", aboutPanel);

        return tabbedPane;
    }
}


