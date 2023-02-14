package view;

import javax.swing.*;
import java.awt.*;

public class canBoNhaVanHoaHomePage extends  JDialog{
    private JPanel canBoNhaVanHoaHomePagePanel;

    public canBoNhaVanHoaHomePage(JFrame parent)
    {
        super(parent);
        setTitle("Can bo nha van hoa Home Page");
        setContentPane(canBoNhaVanHoaHomePagePanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);
    }
    public static void main(String[] args)
    {
        canBoNhaVanHoaHomePage canBoNhaVanHoaHomePage = new canBoNhaVanHoaHomePage(null);
    }
}
