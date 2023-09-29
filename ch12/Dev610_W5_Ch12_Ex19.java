package ch12;

import javax.swing.*;
import java.awt.*;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex19 extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cantor Set");
        Dev610_W5_Ch12_Ex19 cantorSet = new Dev610_W5_Ch12_Ex19();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        frame.add(cantorSet);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCantorSet(g, 50, 50, getWidth() - 100, 20, 5);
    }

    private void drawCantorSet(Graphics g, int x, int y, int width, int height, int depth) {
        if (depth <= 0) {
            return;
        }
        int newY = y + height + 10;
        int newWidth = width / 3;
        g.drawLine(x, y, x + newWidth - 1, y);
        g.drawLine(x + 2 * newWidth, y, x + 3 * newWidth - 1, y);
        drawCantorSet(g, x, newY, newWidth, height, depth - 1);
        drawCantorSet(g, x + 2 * newWidth, newY, newWidth, height, depth - 1);
    }

}

