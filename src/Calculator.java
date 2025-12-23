import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {
    int boardWidth = 360;
    int boardHeight = 540;

    Color customHoneydew = new Color(241, 254, 243);
    Color customMint = new Color(165, 230, 212);
    Color customAcqua = new Color(132, 207, 200);
    Color customPink = new Color(237, 152, 186);

    JFrame frame = new JFrame("Calculadora");

    Calculator() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }

}
