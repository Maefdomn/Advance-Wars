package project.AdvanceWars.controlleurs;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import project.AdvanceWars.dto.PartieDto;
import project.AdvanceWars.services.ServiceCarte;
import project.AdvanceWars.services.ServiceJoueur;
import project.AdvanceWars.services.ServiceWindow;
import project.AdvanceWars.services.interfaces.IServiceCarte;
import project.AdvanceWars.services.interfaces.IServiceJoueur;
import project.AdvanceWars.services.interfaces.IServiceWindow;

public class MainWindowGame extends JFrame {
	private static final long serialVersionUID = 1L;

	public final IServiceWindow serviceWindow = new ServiceWindow();

	public final IServiceJoueur serviceJoueur = new ServiceJoueur();

	public final IServiceCarte serviceCarte = new ServiceCarte();

	private PartieDto partie;
	private JButton[][] casesButton;

	public MainWindowGame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(Boolean.TRUE);
		getContentPane().setLayout(new BorderLayout());
		setResizable(Boolean.FALSE);

		final PartieDto partie = new PartieDto();
		partie.setJoueurs(serviceJoueur.createFourDefaultPlayers());
		partie.setCarte(serviceCarte.createDefaultCarte());

		setPartie(partie);
		setCasesButton(new JButton[10][15]);

		serviceWindow.createCasesPanelDefault(getPartie().getCarte(), this);
		serviceWindow.createPanelJoueur();
		serviceWindow.createPanelInfosCurseur();

		pack();
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
}
