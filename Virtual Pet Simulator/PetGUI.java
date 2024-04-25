package view;

import javax.swing.*;

public class PetGUI {
    private JFrame frame;
    private JLabel statusLabel;

    public PetGUI() {
        frame = new JFrame("Virtual Pet Simulator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        statusLabel = new JLabel("Pet Status");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(statusLabel);

        frame.setVisible(true);
    }

    public void updateStatus(String status) {
        statusLabel.setText(status);
    }
}
