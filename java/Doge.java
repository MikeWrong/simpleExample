import javax.swing.*;
import java.awt.*;
public class Doge extends JFrame{
	ImageIcon imageIcon = new ImageIcon("./doge.jpg"); 
	Image img = imageIcon.getImage();
	private int w;
	private int h;
	public Doge() {
		this.setTitle("精神污染doge");
		Toolkit tool = this.getToolkit();
		Dimension d = tool.getScreenSize();
		setSize(d);
		w = d.width;
		h = d.height;
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, (int) (Math.random()*w), (int) (Math.random()*h), null);
	}
	public static void main(String[] args) throws InterruptedException {
		Doge doge = new Doge();
		while (true){
			doge.repaint();
			Thread.sleep(1);
		}
	}
}
