package game;
import javax.swing.ImageIcon;

public class Consts {
	public static final int row_num = 15, col_num = 15;
	public static final int square_height = 30, square_width = 30;
	private static ImageIcon nothingIcon=null,blackIcon=null,whiteIcon=null;

	static {
		nothingIcon = new ImageIcon("nothing.PNG");
		blackIcon = new ImageIcon("black.PNG");
		whiteIcon = new ImageIcon("white.PNG");
	}
	public static ImageIcon getNothingIcon(){
		return nothingIcon;
	}
	public static ImageIcon getBlackIcon(){
		return blackIcon;
	}
	public static ImageIcon getWhiteIcon(){
		return whiteIcon;
	}
}
