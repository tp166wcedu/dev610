package ch12;

import javax.swing.*;
import java.awt.*;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex18 extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sierpinski Carpet");
        Dev610_W5_Ch12_Ex18 carpet = new Dev610_W5_Ch12_Ex18();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(carpet);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCarpet(g, 0, 0, getWidth(), getHeight(), 4);
    }

    private void drawCarpet(Graphics g, int x, int y, int width, int height, int depth) {
        if (depth <= 0) {
            return;
        }

        int subWidth = width / 3;
        int subHeight = height / 3;

        g.fillRect(x + subWidth, y + subHeight, subWidth, subHeight);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) continue;
                drawCarpet(g,
                        x + i * subWidth,
                        y + j * subHeight,
                        subWidth,
                        subHeight,
                        depth - 1
                );
            }
        }
    }

}

