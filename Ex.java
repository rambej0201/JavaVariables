class Ex 
{
	int a = 28; //declaring instance variable
	int b = 39; //declaring instance variable

	static int x = 45; //declaring static variable
	static int y = 55; //declaring static variable

	void m1(){ //declaring instance method to print instance and static variable
		Ex v1 = new Ex(); 
		System.out.println(a);
		System.out.println(b);
		System.out.println(v1.x); //loading static variable through an object as its an instance method 
		System.out.println(v1.y); //loading static variable through an object as its an instance method
	}

	static void m2(){
		Ex v2 = new Ex();
		System.out.println(v2.a); //loading instance variable through an object as its a static variable 
		System.out.println(v2.b); //loading instance variable through an object as its a static variable
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) 
	{
		Ex v3 = new Ex();
		v3.m1(); //invoking instance method through an object as its static main method
		System.out.println("Second method //n ");
		m2();
	}
}
