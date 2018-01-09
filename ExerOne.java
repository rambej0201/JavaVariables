class ExerOne 
{
	int a = 5;
	String s = "five";

	double b = 7.5;
	String t = "Three quarters";

	static void m1(){
		ExerOne e = new ExerOne();
		System.out.println(e.a+" in words is : ");
		System.out.println(e.s+" I think ");
	}

	static void m2(){
		ExerOne f = new ExerOne();
		System.out.println(f.b+ " in words is : ");
		System.out.println(f.t);
	}

	public static void main(String[] args) 
	{
		ExerOne x = new ExerOne();
		System.out.println(x.a+ " in english is : ");
		System.out.println(x.s);
		x.m1();
		x.m2();

	}
}
