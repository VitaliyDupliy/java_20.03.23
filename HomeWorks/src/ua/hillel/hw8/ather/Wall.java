package ua.hillel.hw8.ather;

public class Wall implements Barrier {

	double height;

	public Wall(double height) {
		this.height = height;
	}

	@Override
	public void overcome(Participant pt) {
		System.out.println("Participant " + "[" + pt.getClass().getSimpleName() + "]" + pt.jump() + " the wall");
	}

}
