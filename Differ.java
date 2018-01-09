class Differ 
{
	//an example to brief differencce between instance & static variable
	int a = 10;
	static int b = 20;
	public static void main(String[] args) 
	{
		Differ d1 = new Differ();
		System.out.println(d1.a);
		System.out.println(b);

		d1.a = 999;
		d1.b = 888;
		System.out.println("Change of variables first");
		System.out.println(d1.a);
		System.out.println(b);
		System.out.println("Change of variables second");
		
		Differ d2 = new Differ();
		System.out.println(d2.a);
		System.out.println(d2.b);

		System.out.println("Change of variables third");
		Differ d3 = new Differ();
		System.out.println(d3.a);
		System.out.println(d3.b);

	}
}
