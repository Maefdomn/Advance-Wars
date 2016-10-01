package project.AdvanceWars.controlleurs;

import java.awt.*;

import javax.swing.*;

import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.dto.PartieDto;

public class MainWindowGame extends JFrame {
	private static final long serialVersionUID = 1L;

	private PartieDto partie;
	private JButton[][] casesButton;

	public MainWindowGame(PartieDto partie) {
		super("Advance Wars");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.getContentPane().setLayout(new BorderLayout());
		this.setResizable(false);

		this.setPartie(partie);
		this.setCasesButton(new JButton[10][15]);

		this.createCasesPanel(this.getPartie().getCarte());
		this.createPanelJoueur();
		this.createPanelInfosCurseur();

		this.pack();
	}

	public PartieDto getPartie() {
		return this.partie;
	}

	public void setPartie(PartieDto partie) {
		this.partie = partie;
	}

	public JButton[][] getCasesButton() {
		return this.casesButton;
	}

	public void setCasesButton(JButton[][] cases) {
		this.casesButton = cases;
	}

	public void setCasesButtonij(int i, int j, JButton cases) {
		this.casesButton[i][j] = cases;
	}

	public void createCasesPanel(CarteDto carte) {
		JPanel cartePanel = new JPanel();
		cartePanel.setLayout(new GridLayout(10, 15));
		ImageIcon[][] casesImg = new ImageIcon[19][19];

		/* Creation de la matrice d'image "casesImg" */
		// Mers en bas a gauche
		for (int i = 5; i < 10; i++) {
			for (int j = 0; j < 7; j++)
				casesImg[i][j] = IMG.IMG_MER;
		}
		// Forets en haut a droite
		for (int i = 0; i < 5; i++) {
			for (int j = 7; j < 15; j++)
				casesImg[i][j] = IMG.IMG_FORET;
		}
		// Plaine pour le reste
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++)
				casesImg[i][j] = IMG.IMG_PLAINE;
		}
		for (int i = 5; i < 10; i++) {
			for (int j = 7; j < 15; j++)
				casesImg[i][j] = IMG.IMG_PLAINE;
		}

		/* Initialisation des boutons */
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				this.setCasesButtonij(i, j, new JButton());
				this.getCasesButton()[i][j].setBorder(null);
				this.getCasesButton()[i][j].setIcon(casesImg[i][j]);
				this.getCasesButton()[i][j].addActionListener(null);
			}
		}

		// Creation de l'interface de la carte

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				cartePanel.add(this.getCasesButton()[i][j]);
			}
		}



		this.getContentPane().add(cartePanel, BorderLayout.CENTER);
	}

	public void createPanelJoueur() {
	}

	public void createPanelInfosCurseur() {
	}

	public static void main(String[] args) {
		new MainWindowGame(new PartieDto());
	}

}
