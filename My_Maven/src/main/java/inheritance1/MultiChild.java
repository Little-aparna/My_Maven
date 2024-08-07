package inheritance1;

public class MultiChild extends MultiParent {
	public void mul ()
	{
	int f=a*b;
	System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiChild obj=new MultiChild();
obj.mul();

obj.display();
obj.sub();
	}

}
