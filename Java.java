import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        try {
            // Carregar a imagem
            Image image = ImageIO.read(new File("caminho/para/sua/imagem.jpg"));

            // Criar um painel para exibir a imagem
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };

            frame.add(panel);
        } catch (IOException e) {
            System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        }

        frame.setVisible(true);
    }
}