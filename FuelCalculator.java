package tekst;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
     public class FuelCalculator {
     private JTextField wayField;
     private JLabel wayLabel;
     private JLabel kmLabel;
     private JTextField averageField;
     private JLabel averageLabel;
     private JLabel litersLabel;
     private JTextField priceField;
     private JLabel priceLabel;
     private JLabel rurLabel;
private JButton calcButton;
private JLabel resultLabel;
private JFrame mainFrame;

  FuelCalculator() {
      wayLabel = new JLabel("Расстояние");
      wayField = new JTextField("0");
      wayField.setHorizontalAlignment(JTextField.RIGHT);
      kmLabel = new JLabel("Км");
      averageLabel = new JLabel("Средний расход топлива на 100 км");
      averageField = new JTextField("0");
      averageField.setHorizontalAlignment(JTextField.RIGHT);
      litersLabel = new JLabel("Л");
      priceLabel = new JLabel("Цена за литр топлива");
      priceField = new JTextField("0");
      priceField.setHorizontalAlignment(JTextField.RIGHT);
      rurLabel = new JLabel("Руб");
      calcButton = new JButton("Рассчитать");
      calcButton.addActionListener(new ActionListener() {
      @Override
           public void actionPerformed(ActionEvent ae) {
try {
double way =Double.parseDouble(wayField.getText());
double average =Double.parseDouble(averageField.getText());
double price =Double.parseDouble(priceField.getText());
double fuel = average / 100.0 * way;
double cost = fuel * price;
resultLabel.setText("<html>Понадобится <fontstyle='color: green; font-weight: bold;'>" + fuel + "</font> литровтоплива, обойдётся в <font style='color: green; font-weight: bold;'>" + cost + "</font> рублей.</html>");
}
catch ( NumberFormatException nfe ) {
resultLabel.setText("Проверьте введённые данные");

   }
  }
}); 

resultLabel = new JLabel("Введите необходимые данные");
GridBagLayout layout = new GridBagLayout();
GridBagConstraints constraints = new GridBagConstraints();
constraints.weightx = 1.0;
constraints.weighty = 1.0;
constraints.insets = new Insets(5, 5, 5, 5);
constraints.gridx = 0;
constraints.anchor = GridBagConstraints.WEST;
constraints.ipadx = 90;
constraints.gridy = 0;
layout.setConstraints(wayLabel, constraints);
constraints.gridy = 1;
layout.setConstraints(averageLabel, constraints);
constraints.gridy = 2;
layout.setConstraints(priceLabel, constraints);
constraints.gridx = 1;
constraints.anchor = GridBagConstraints.EAST;
constraints.ipadx = 50;
constraints.gridy = 0;
layout.setConstraints(wayField, constraints);
constraints.gridy = 1;
layout.setConstraints(averageField, constraints);
constraints.gridy = 2;
layout.setConstraints(priceField, constraints);
constraints.gridx = 2;
constraints.ipadx = 0;
constraints.gridy = 0;
layout.setConstraints(kmLabel, constraints);
constraints.gridy = 1;
layout.setConstraints(litersLabel, constraints);
constraints.gridy = 2;
layout.setConstraints(rurLabel, constraints);
constraints.gridx = 0;
constraints.gridy = 4;
constraints.gridwidth = GridBagConstraints.REMAINDER;
constraints.anchor = GridBagConstraints.EAST;
layout.setConstraints(calcButton, constraints);
constraints.gridy = 5;
constraints.fill = GridBagConstraints.HORIZONTAL;
constraints.anchor = GridBagConstraints.WEST;
layout.setConstraints(resultLabel, constraints);
mainFrame = new JFrame("Расход топлива");
mainFrame.setSize(650, 500);
mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
mainFrame.setLayout(layout);
mainFrame.add(wayLabel);
mainFrame.add(averageLabel);
mainFrame.add(priceLabel);
mainFrame.add(wayField);
mainFrame.add(averageField);
mainFrame.add(priceField);
mainFrame.add(kmLabel);
mainFrame.add(litersLabel);
mainFrame.add(rurLabel);
 mainFrame.add(calcButton);
mainFrame.add(resultLabel);
mainFrame.pack();
mainFrame.setVisible(true);
}
}




