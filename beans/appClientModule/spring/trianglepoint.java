package spring;


public class trianglepoint {
	
	private point pointA;
	private point pointB;
	private point pointC;
	public point getPointA() {
		return pointA;
	}
	public void setPointA(point pointA) {
		this.pointA = pointA;
	}
	public point getPointB() {
		return pointB;
	}
	public void setPointB(point pointB) {
		this.pointB = pointB;
	}
	public point getPointC() {
		return pointC;
	}
	public void setPointC(point pointC) {
		this.pointC = pointC;
	}
	public void Inra() {
		System.out.println("trianglepoint [pointA=(" + pointA.getX() + "," + pointA.getY() + ")| pointB=(" + pointB.getX() + "," + pointB.getY() + ")| pointC=(" + pointC.getX() + "," + pointC.getY() + ") ]");
	}

}
