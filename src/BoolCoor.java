
public class BoolCoor {
	boolean bool;
	int x;
	int y;
	
	public BoolCoor(int xCoord, int yCoord, boolean boolVar){
		x=xCoord;
		y=yCoord;
		bool=boolVar;
		}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public boolean getBool(){
		return bool;
	}
}
