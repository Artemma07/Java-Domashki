import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class DisplayImage extends JFrame {

    private BufferedImage image;

    public DisplayImage(String imagePath) {
        try {
            this.image = ImageIO.read(new File(imagePath));
        } catch (Exception e) {
            e.printStackTrace();
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Изображение");
        setSize(image.getWidth(), image.getHeight());
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        String imagePath = "C:/Users/Artem/OneDrive/Изображения/glek2.jpg"; // Замените это значение на путь к вашей картинке

        EventQueue.invokeLater(() -> {
            DisplayImage displayImage = new DisplayImage(imagePath);
            displayImage.setVisible(true);
        });
    }
}