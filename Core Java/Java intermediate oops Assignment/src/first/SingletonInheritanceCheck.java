package first;


class SingletonInheritanceCheck{
	static SingletonInheritanceCheck obj = new SingletonInheritanceCheck();
	
	private SingletonInheritanceCheck(){
	}
	
	public static SingletonInheritanceCheck getInstance() {
		return obj;
	}
}


