package interfaces;

import Classes.ITOparetor;

public interface ITOparetions {
	boolean insertITOparetor(ITOparetor io);
	boolean removeITOparetor(ITOparetor io);
	ITOparetor searchITOparetor(int id);
	public void showITOparetorInfo();
}