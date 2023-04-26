package ua.hillel.hw8.ather;

public class Cat implements Participant{
	
	final double runable = 150;
	final double jumpable = 1.0;

	@Override
	public String run() {
		return "has ran";
	}

	@Override
	public String jump() {
		return " has jumped over ";
	}

}
