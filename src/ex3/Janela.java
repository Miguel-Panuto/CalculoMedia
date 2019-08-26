package ex3;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame
{
    int n;
    private Quarto[][] quartos = new Quarto[5][10];
    private JButton[] btns = new JButton[3];
    private JPanel p = new JPanel();

    public Janela()
    {
        for (int i = 0 ; i < 5; i++)
        {
            for (int j = 0 ; j < 10; j++)
            {
                quartos[i][j] = new Quarto("Vazio");
            }
        }
        setMinimumSize(new Dimension(400, 150));
        redBtns();
        btns[0].setText("Imprimir lista de quartos");
        btns[1].setText("Definir Ocupação");
        btns[2].setText("Sair");
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setAlignmentY(getAlignmentY());
        add(p);
        pack();
        setResizable(false);
        setVisible(true);
    }

    public void redBtns()
    {
        for (int i = 0; i < btns.length; i++)
        {
            btns[i] = new JButton();
            btns[i].setMinimumSize(new Dimension(300, 50));
            btns[i].setMaximumSize(new Dimension(300, 50));
            btns[i].setAlignmentX(p.getAlignmentX());
            p.add(btns[i]);
        }
    }


    public void showRooms()
    {
        JLabel[][] label = new JLabel[5][10];
        for (int i = 0 ; i < 5; i++)
        {
            for (int j = 0 ; j < 10; j++)
            {
                label[i][j] = new JLabel("Quarto " + j + " do andar" + i + " está: " + quartos[i][j].getStatus());
                this.getContentPane().add(label[i][j]);
            }
        }
        this.pack();
    }

}
