package inheritance1;

public class HierarchicalChild1 extends HierarchicalParent {
public void sub()
{
int s=a-b;
System.out.println(s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HierarchicalChild1 obj=new HierarchicalChild1();
obj.add();
obj.sub();
	}

}
