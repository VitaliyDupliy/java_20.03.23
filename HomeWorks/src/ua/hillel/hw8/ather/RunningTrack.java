package ua.hillel.hw8.ather;

public class RunningTrack implements Barrier {

	int logitude;

	public RunningTrack(int logitude) {

		this.logitude = logitude;
	}

	@Override
	public void overcome(Participant pt) {
		
		System.out.println("Participant " + "[" + pt.getClass().getSimpleName() 
				+ "]" + pt.run() + " the running track");
	}

}
