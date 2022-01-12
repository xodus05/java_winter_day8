package test.abstract1;

public abstract class Car {
	public String name;
	
	public void showInfo() {
		System.out.println("Car는 자식 클래스를 규격화 하는 추상 클래스이다.");
	}
	
	public abstract void drive();
	public abstract void stop();
	public abstract void turnLeft();
	public abstract void turnRight();
}
