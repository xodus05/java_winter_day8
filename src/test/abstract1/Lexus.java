package test.abstract1;

public class Lexus extends Car {
	private String producer = "Lexus";

	@Override
	public void drive() {
		System.out.println(producer + "자동차가 주행한다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub

	}

}
