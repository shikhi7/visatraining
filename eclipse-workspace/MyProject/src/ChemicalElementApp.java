
public class ChemicalElementApp {
	public static void main(String[] args) {
		ChemicalElement el1 = new ChemicalElement(37,"ab","bk");
//		el1.atomicNum = 37;
		ChemicalElement el2 = new ChemicalElement(25,"a","b");
//		el2.atomicNum = 25;
		ChemicalElement el3 = new ChemicalElement(81,"a","b");
//		el3.atomicNum = 81;
		ChemicalElement el4 = el3;
		System.out.println(el1.isAlkaliMetal());
		System.out.println(el2.isTransitionMetal());
		System.out.println(el3.isMetal());
		System.out.println(el3==el4);
		System.out.println(el3==el1);
		ChemicalElement el5 = new ChemicalElement(81,"a","b");
//		el5.atomicNum = 81;
		System.out.println(el5.equals(el3));
		System.out.println(el5==el3);
	}
}
