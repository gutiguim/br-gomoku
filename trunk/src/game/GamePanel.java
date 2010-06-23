package game;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int panel_height = Consts.row_num * Consts.square_height,
			panel_width = Consts.col_num * Consts.square_width;
	private GameSquare[][] square;
	private static GamePanel instance=null;
	private GamePanel() {
		this.setPreferredSize(new Dimension(panel_width, panel_height));
		this.setLayout(new GridLayout(Consts.row_num,Consts.col_num));
		square=new GameSquare[Consts.row_num][Consts.col_num];
		for(int i=0;i<Consts.row_num;i++)
			for(int j=0;j<Consts.col_num;j++){
				square[i][j]=new GameSquare(i,j);
				this.add(square[i][j]);
			}
	}
	public static GamePanel getInstance(){
		if(instance==null){
			instance=new GamePanel();
		}
		return instance;
	}
	public static GameSquare getGameSquare(int i,int j){
		return getInstance().square[i][j];
	}
	public static void putPieceOn(int i,int j){
		getGameSquare(i,j).putPiece();
	}
	public static void removePieceOn(int i,int j){
		getGameSquare(i,j).removePiece();
	}
	public static void clearBoard() {
		GamePanel gp=getInstance();
		for(int i=0;i<Consts.row_num;i++)
			for(int j=0;j<Consts.col_num;j++){
				gp.square[i][j].setEnabled(true);
			}
	}
}
