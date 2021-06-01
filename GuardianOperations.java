package interfaces;

import Classes.Guardian;

public interface GuardianOperations {
	boolean insertGuardian(Guardian g);
	boolean removeGuardian(Guardian g);
	Guardian searchGuardian(int nid);
	public void showGuardianInfo();
}