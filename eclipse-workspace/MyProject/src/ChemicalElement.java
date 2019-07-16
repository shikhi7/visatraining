import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ChemicalElement {
	
	public ChemicalElement(int atomicNum, String symName, String fullName) {
		this.atomicNum = atomicNum;
		this.symName = "Kil";
		this.fullName = "Dil";
	}
	
	public boolean equals(Object o) {
		ChemicalElement other = (ChemicalElement) o;
		if (this.atomicNum == other.atomicNum) {
			return true;
		} else return false;
	}
	
	static int[] alkaliAN = {3,11,19,37,55,87};
	static boolean[] alkaliMetal;
	static {
		alkaliMetal = new boolean[120];
		Arrays.fill(alkaliMetal, false);
		for (int i=0; i<alkaliAN.length; i++) {
			alkaliMetal[alkaliAN[i]] = true;
		}
	}
	int[] metal = {13,49,50,81,82,83,113,114,115,116};
	int atomicNum;
	String symName, fullName;
	
	public boolean isAlkaliMetal() {
		return ChemicalElement.alkaliMetal[this.atomicNum];
	}
	public boolean isMetal() {
		for (int i=0; i<this.metal.length; i++) {
			if (this.atomicNum == this.metal[i]) {
				return true;
			}
		}
		return false;
	}
	public boolean isTransitionMetal() {
		boolean ans = false;
		if ((this.atomicNum > 21) && (this.atomicNum < 31)){
			ans = true;
		} else if ((this.atomicNum > 39) && (this.atomicNum < 48)){
			ans = true;
		}else if ((this.atomicNum > 72) && (this.atomicNum < 80)){
			ans = true;
		}else if ((this.atomicNum > 104) && (this.atomicNum < 112)){
			ans = true;
		}
		return ans;
	}
}
