package project.AdvanceWars.persistance.dao;

import java.io.File;

import javax.swing.ImageIcon;

public class IMG {

	public ImageIcon getPlaineImage() {
		return new ImageIcon("images" + File.separator + "carreJaune.png");
	}

	public ImageIcon getForetImage() {
		return new ImageIcon("images" + File.separator + "carreVert.png");
	}

	public ImageIcon getMontageImage() {
		return new ImageIcon("images" + File.separator + "carreRouge.png");
	}

	public ImageIcon getRouteImage() {
		return new ImageIcon("images" + File.separator + "carreGris.png");
	}

	public ImageIcon getMerImage() {
		return new ImageIcon("images" + File.separator + "carreBleu.png");
	}

	public ImageIcon getQGImage() {
		return new ImageIcon("images" + File.separator + "carreOrange.png");
	}

	public ImageIcon getVilleImage() {
		return new ImageIcon("images" + File.separator + "carreJaune.png");
	}

}
