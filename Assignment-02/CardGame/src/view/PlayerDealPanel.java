package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.PlayerDealController;
import model.interfaces.GameEngine;

public class PlayerDealPanel extends JPanel {

	private JButton dealPlayer;
	private JTextField card1;
	private JTextField card2;
	private JTextField cardPair;

	/*
	 * getters for JTextField for dice1, dice2, and total dice Pair for the player
	 * so they can be easily accessed
	 */
	public JTextField getCard1() {
		return card1;
	}

	public JTextField getCard2() {
		return card2;
	}

	public JTextField getCardPair() {
		return cardPair;
	}

	public JButton getDealPlayer() {
		return dealPlayer;
	}

	public PlayerDealPanel(GameEngine gameEngine, CardGameFrame frame) {
		///
		setBorder(BorderFactory.createLineBorder(Color.black, 3));

		dealPlayer = new JButton("Roll Player");
		add(dealPlayer);
		PlayerDealController playerDealController = new PlayerDealController(frame, gameEngine);
		dealPlayer.addActionListener(playerDealController);
		JLabel playerCard1 = new JLabel("Player's Card 1: ");
		card1 = new JTextField("", 5);
		JLabel playerCard2 = new JLabel("Player's Card 2: ");
		card2 = new JTextField("", 5);
		JLabel totalDicePair = new JLabel("Total: ");
		cardPair = new JTextField("", 5);

		add(playerCard1, BorderLayout.WEST);
		add(card1, BorderLayout.WEST);
		add(playerCard2, BorderLayout.WEST);
		add(card2, BorderLayout.WEST);
		add(totalDicePair, BorderLayout.WEST);
		add(cardPair, BorderLayout.WEST);

	}

}