class  Emp
{
	int eid;
	String ename;
	String ecomp;

	public static void main(String[] args) 
	{
			Emp e1 = new Emp();
			Emp e2 = new Emp();
			Emp e3 = new Emp();

		//values for first object
		e1.eid = 111;
		e1.ename = "Sari";
		e1.ecomp = "SPJ";

		//values for second onject
		e2.eid = 222;
		e2.ename = "Bujji";
		e2.ecomp = "Anuradha";

		//values for third object
		e3.eid = 333;
		e3.ename = "Sandya";
		e3.ecomp = "Gouri";

		System.out.println(e1.eid+" ID of Employee name is "+e1.ename+" and Company is "+e1.ecomp);
		System.out.println(e2.eid+" ID of Employee name is "+e2.ename+" and Company is "+e2.ecomp);
		System.out.println(e3.eid+" ID of Employee name is "+e3.ename+" and Company is "+e3.ecomp);
	}
}
