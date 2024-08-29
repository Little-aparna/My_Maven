package inheritance1;

public class HierarchicalChild2 extends HierarchicalParent{
	public void mul()
	{
	int m=a*b	;
	System.out.println(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild2 obj1=new HierarchicalChild2();
		obj1.add();
		obj1.mul();

	}

}
