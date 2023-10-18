import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        Random random = new Random();
        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        this.color = new Color(r, g, b);
    }

    public abstract void draw(Graphics g);
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

public class Main extends JFrame {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    public Main() {
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);

            int shapeType = random.nextInt(2);
            Shape shape;
            if (shapeType == 0) {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shape = new Rectangle(x, y, width, height);
            } else {
                int radius = random.nextInt(50) + 10;
                shape = new Circle(x, y, radius);
            }

            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}