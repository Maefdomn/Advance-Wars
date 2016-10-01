package project.AdvanceWars.services;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import project.AdvanceWars.controlleurs.IMG;
import project.AdvanceWars.controlleurs.MainWindowGame;
import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.services.interfaces.IServiceWindow;

public class ServiceWindow implements IServiceWindow {

	@Override
	public void createCasesPanelDefault(CarteDto carte, MainWindowGame mainWindowGame) {
		final JPanel cartePanel = new JPanel();
		final GridLayout gridLayout = new GridLayout(10, 15);
		cartePanel.setLayout(gridLayout);
		final ImageIcon[][] casesImg = new ImageIcon[19][19];

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
				final JButton buttonToEdit = new JButton();
				buttonToEdit.setBorder(null);
				buttonToEdit.setIcon(casesImg[i][j]);
				buttonToEdit.addActionListener(null);

				mainWindowGame.getCasesButton()[i][j] = buttonToEdit;
			}
		}

		// Creation de l'interface de la carte
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				cartePanel.add(mainWindowGame.getCasesButton()[i][j]);
			}
		}
		mainWindowGame.getContentPane().add(cartePanel, BorderLayout.CENTER);
	}

	@Override
	public void createPanelJoueur() {
	}

	@Override
	public void createPanelInfosCurseur() {
	}

}
