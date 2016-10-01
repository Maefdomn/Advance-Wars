package project.AdvanceWars.services;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import project.AdvanceWars.controlleurs.MainWindowGame;
import project.AdvanceWars.dto.CarteDto;
import project.AdvanceWars.dto.unites.UniteDto;
import project.AdvanceWars.persistance.dao.IMG;
import project.AdvanceWars.services.interfaces.IServiceWindow;

public class ServiceWindow implements IServiceWindow {

	public final IMG img = new IMG();

	@Override
	public void createCasesPanelDefault(CarteDto carte, MainWindowGame mainWindowGame) {
		final JPanel cartePanel = new JPanel();
		final GridLayout gridLayout = new GridLayout(10, 15);
		cartePanel.setLayout(gridLayout);
		final ImageIcon[][] casesImg = new ImageIcon[19][19];

		/* Creation de la matrice d'image "casesImg" */
		// Vert et Violet
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 7; j++)
				casesImg[i][j] = img.getForetImage();
			for (int j = 7; j < 15; j++)
				casesImg[i][j] = img.getQGImage();
		}
		// Bleu
		for (int i = 1; i < 10; i++) {
			for (int j = 5; j < 10; j++)
				casesImg[i][j] = img.getMerImage();
		}
		for (int j = 2; j < 13; j++) {
			for (int i = 6; i < 10; i++)
				casesImg[i][j] = img.getMerImage();
		}
		// Orange
		for (int j = 6; j < 9; j++) {
			for (int i = 2; i < 9; i++)
				casesImg[i][j] = img.getVilleImage();
		}
		for (int i = 7; i < 9; i++) {
			for (int j = 3; j < 5; j++)
				casesImg[i][j] = img.getVilleImage();
			for (int j = 10; j < 12; j++)
				casesImg[i][j] = img.getVilleImage();
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

	public void affichageZoneDeplacement(UniteDto unite) {
		
	}
}
