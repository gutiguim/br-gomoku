package game;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import player.Human;

public class GameSquare extends JButton implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int row_idx, col_idx;

	public GameSquare(int i, int j) {
		row_idx = i;
		col_idx = j;
		this.setIcon(Consts.getNothingIcon());
		this.addActionListener(this);
		this.setBorderPainted(false);
		this.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (Game.getCurrentPlayer() instanceof Human) {
			((Human)Game.getCurrentPlayer()).humanMove(row_idx,col_idx);
		}
	}
	public void removePiece(){
		this.setDisabledIcon(Consts.getNothingIcon());
		this.setEnabled(true);
	}
	public void putPiece(){
		switch (Game.getWhosTurn()) {
		case BLACK:
			this.setDisabledIcon(Consts.getBlackIcon());
			this.setEnabled(false);
			break;
		case WHITE:
			this.setDisabledIcon(Consts.getWhiteIcon());
			this.setEnabled(false);
			break;
		}
	}
}
