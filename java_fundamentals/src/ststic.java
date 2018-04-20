


class Test {
	static int number1=0;
	int number2 = 0;
	String name;
}

public class ststic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test1 = new Test();
		Test test2 = new Test();
		System.out.println(test1.number1);
		test1.number1 = 10;
		System.out.println(test2.number1);
		System.out.println(test1.number1);
		System.out.println("----------------------");
		test1.number2=10;
		System.out.println(test1.number2);
		System.out.println(test2.number2);
	}

}
