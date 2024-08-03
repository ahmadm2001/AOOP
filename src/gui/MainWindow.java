package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by AHMAD MASHAL
 */
public class MainWindow extends JFrame {
    private JPanel arenaPanel;
    private JButton buildArenaButton;
    private JButton startCompetitionButton;
    private JComboBox<String> arenaTypeComboBox;
    private JComboBox<String> weatherComboBox;
    private JTextField arenaLengthField;

    public MainWindow() {
        setTitle("Competition Simulator");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Arena panel
        arenaPanel = new JPanel();
        arenaPanel.setPreferredSize(new Dimension(700, 600));
        arenaPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(arenaPanel, BorderLayout.CENTER);

        // Control panel
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(6, 1));

        // Arena type selector
        controlPanel.add(new JLabel("Select Arena Type:"));
        arenaTypeComboBox = new JComboBox<>(new String[]{"Ski", "Snowboard"});
        controlPanel.add(arenaTypeComboBox);

        // Weather selector
        controlPanel.add(new JLabel("Select Weather:"));
        weatherComboBox = new JComboBox<>(new String[]{"Sunny", "Cloudy", "Snowy"});
        controlPanel.add(weatherComboBox);

        // Arena length input
        controlPanel.add(new JLabel("Enter Arena Length (700-900):"));
        arenaLengthField = new JTextField("800");
        controlPanel.add(arenaLengthField);

        // Build arena button
        buildArenaButton = new JButton("Build Arena");
        controlPanel.add(buildArenaButton);
        buildArenaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implement arena building logic
            }
        });

        // Start competition button
        startCompetitionButton = new JButton("Start Competition");
        controlPanel.add(startCompetitionButton);
        startCompetitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implement competition start logic
            }
        });

        add(controlPanel, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
}
