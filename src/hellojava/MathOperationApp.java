package hellojava;

@FunctionalInterface
interface IMathFunction{
	int calculate(int a, int b);
	static void printResult(int a,int b ,String function,IMathFunction fobj)
	{
		System.out.println("Result of "+function+" is "+fobj.calculate(a, b));
	}
}

public class MathOperationApp {

	public static void main(String[] args) {
		IMathFunction add = Integer::sum;
//		IMathFunction add = (int a, int b)-> a+b;
		IMathFunction divide = (int x, int y) -> { 
			if(y==0) return 0;
			return x / y;
			};
		IMathFunction multiply = (x, y) -> x*y;
		IMathFunction subtract = (int a, int b)-> a-b;
		
		System.out.println("Add is "+add.calculate(6, 7));
		System.out.println("Sub is "+subtract.calculate(6, 7));
		System.out.println("Mul is "+multiply.calculate(6, 7));
		System.out.println("Div is "+divide.calculate(6, 7));
		
		IMathFunction.printResult(6,3,"addition",add);
	}

}
