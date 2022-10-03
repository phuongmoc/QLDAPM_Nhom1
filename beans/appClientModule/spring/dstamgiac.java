package spring;
import java.util.List;


public class dstamgiac {
	private List<point> points;
	public List<point> getPoints() {
		return points;
	}
	
	public void setPoints(List<point> points) {
		this.points = points;
	}
	
	public void inra() {
		for(point point:points) {
			System.out.println("Point=("+ point.getX() + "," + point.getY() +")");
		} 
	

}
	
}
