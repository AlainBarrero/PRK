package ehu;

import javax.swing.JFrame;

public class Framea extends JFrame{

	private static final long serialVersionUID = 1L;
	Panela panela = new Panela();
	
	public Framea(){
		super();
		initialize();
	}

	private void initialize() {
		this.setTitle("San Pedro - San Juan");
		this.add(panela);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
	}
}

