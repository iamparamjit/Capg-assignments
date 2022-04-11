
 abstract class AbstractClass {
	
	//abstract method
	public abstract int checkAdd();

	//non-abstract method
	public int CheckAdd2() {
		return 0;
	}
}

private abstract class AbstractClassPrivate {

	}

final abstract class AbstractClassFinal {

	}

 

abstract class AbstractClassWithoutAnyMethod {

}

class NonAbstractClass extends AbstractClass {

	public int checkAdd() {
		return 0;
	}

	public int CheckAdd2() {
		return 1;
	}

}

public class Assignment2Q4 {
	public static void main(String[] arg) {
		
		
		AbstractClass myAbs = new AbstractClass();
	}
	
	
}
