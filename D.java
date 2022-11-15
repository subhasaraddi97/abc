package iterface;

public class D implements A,B,C {

	@Override
	public void test3() {
		System.out.println(100);
	}

	@Override
	public void test1() {
	System.out.println(200);	
	}

	@Override
	public void test2() {
	System.out.println(300);	
	}
	public static void main(String[] args) {
		D d2=new D();
		d2.test1();
		d2.test3();
		d2.test2();
	}

	

}
