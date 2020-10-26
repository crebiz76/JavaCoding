// [바로실행] 생활코딩 - 자바(JAVA)
import java.util.ArrayList; // As for Chapter05.section11
import java.util.Scanner;   // As for Chapter10.section22
import java.util.Arrays;    // As for Chapter13.section34
import java.io.*;           // As for Chapter15.section47

import srcbin.*;			// As for Chapter26.*

class Main
{
	public static void main(String[] args)
	{
		Chapter39.section125();
	}
}

// 39 - 제네릭(예제 125)
class Person<T>
{
	public T info;
}

// public class GenericDemo
class GenericDemo
{
	GenericDemo()
	{
		Person<String> p1 = new Person<String>();
		Person<StringBuilder> p2 = new Person<StringBuilder>();
		System.out.println(p1);
		System.out.println(p2);
	}
}

// 39 - 제네릭
class Chapter39 //extends GenericDemo
{
	// 125. 제네릭의 사용
	public static void section125()
	{
		GenericDemo gd = new GenericDemo();
		System.out.println(gd);
	}
}

// 38 - 참조(예제 122, 124)
class A122
{
	public int id;
	A122(int id)
	{
		this.id = id;
	}
}

class Reference
{
	static void _value(int b)
	{
		b = 2;
	}

	public static void runValue()
	{
		int a = 1;
		_value(a);
		System.out.println("runValue, "+a);
	}

	static void _reference1(A122 b)
	{
		b = new A122(2);
	}

	public static void runReference1()
	{
		A122 a = new A122(1);
		_reference1(a);
		System.out.println("runReference1, "+a.id);
	}
	
	static void _reference2(A122 b)
	{
		b.id = 2;
	}

	public static void runReference2()
	{
		A122 a = new A122(1);
		_reference2(a);
		System.out.println("runReference2, "+a.id);
	}
}

class Reference122
{
	public static void runValue()
	{
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue(a), "+a);
		System.out.println("runValue(b), "+b);
	}

	public static void runReference()
	{
		A122 a = new A122(1);
		A122 b = a;
		b.id = 2;
		System.out.println("runReferene(a), " +a.id);
		System.out.println("runReferene(a), " +b.id);
	}
}

// 38 - 참조
class Chapter38 extends Reference
{
	// 124. 메서드와 참조
	public static void section124()
	{
		runValue();
		runReference1();
		runReference2();
	}

	// 123. 참조와 복제
	public static void section123()
	{
		System.out.println("123. 참조와 복제");
	}

	// 122. 참조
	public static void section122()
	{
		runValue();
		// runReference();
	}

	// 121. 복제
	public static void section121()
	{
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue(a), "+a);
		System.out.println("runValue(b), "+b);
	}
}

// 37 - 상수와 enum(예제 119, 120)
enum FRUITS
{
	// APPLE, PEACH, BANANA;
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color;
	FRUITS(String color)
	{
		System.out.println("Call Constructor "+this);
		this.color = color;
	}
	String getColor()
	{
		return this.color;
	}
}

enum COMPANYS
{
	GOOGLE, APPLE, ORACLE;
}

// 37 - 상수와 enum(예제 118)
class Fruit
{	
	private static final Fruit APPLE = new Fruit();
	private static final Fruit PEACH = new Fruit();
	private static final Fruit BANANA = new Fruit();

	Fruit()
	{
		System.out.println("Fruit class");
		System.out.println("apple=" + APPLE);
		System.out.println("peach=" + PEACH);
		System.out.println("banana=" + BANANA);
	}
}

class Company extends Fruit
{
	private static final Company GOOGLE = new Company();
	private static final Company APPLE = new Company();
	private static final Company ORACLE = new Company();

	Company()
	{
		System.out.println("Company class");
		System.out.println("google=" + GOOGLE);
		System.out.println("apple=" + APPLE);
		System.out.println("oracle=" + ORACLE);
	}
}

// 37 - 상수와 enum
class Chapter37 //extends Company
{
	// 120. Enum과 생성자
	public static void section120()
	{
		for(FRUITS f: FRUITS.values())
		{
			System.out.println(f+", "+f.getColor());
		}
	}

	// 119. Enum의 문법
	public static void section119()
	{
		FRUITS type = FRUITS.APPLE;
		switch(type)
		{
			case APPLE:
			System.out.println(57+"kcal");
			break;

			case PEACH:
			System.out.println(34+"kcal");
			break;

			case BANANA:
			System.out.println(93+"kcal");
			break;
		}
		// System.out.println(FRUITS.APPLE);
		// System.out.println(FRUITS.PEACH);
		// System.out.println(FRUITS.BANANA);
	}

	// 118. Enum의 배경
	// private final static int GOOGLE = 1;
	// private final static int APPLE = 2;
	// private final static int ORACLE = 3;

	public static void section118()
	{
		// if(Fruit.APPLE == Company.APPLE)
		{
			System.out.println("과일 애플과 회사 애플이 같다?");
		}
	}

	// 117. 상수에 대한 복습
	private final static int APPLES = 1;
	private final static int PEACHS = 2;
	private final static int BANANAS = 3;

	public static void section117()
	{
		int type = APPLES;
		switch(type)
		{
			case APPLES:
			System.out.println(57+"kcal");
			break;

			case PEACHS:
			System.out.println(34+"kcal");
			break;

			case BANANAS:
			System.out.println(93+"kcal");
			break;
		}
	}
}

// 36 - Object 클래스(예제 116)
class Human
{
	protected String test()
	{
		return "test";
	}
}

class Student116 extends Human implements Cloneable
{
	String name;
	Student116(String name)
	{
		this.name = name;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

// 36 - Object 클래스(예제 114)
class Student	//extends Object
{
	String name;
	Student(String name)
	{
		this.name = name;
	}
	public boolean equals(Object obj)
	{
		Student _obj = (Student)obj;
		// return name == _obj.name;
		return this.name == _obj.name;
	}
}

// 36 - Object 클래스(예제 113)
class Calculator113
{
	int left, right;
	public void setOprands(int left, int right)
	{
		this.left = left; this.right = right;
	}
	public void sum()
	{
		System.out.println(this.left + this.right);
	}
	public void avg()
	{
		System.out.println((this.left + this.right)/2);
	}
	public String toString()
	{
		return "left: " + this.left + ", right: " + this.right;
	}
}

// 36 - Object 클래스(예제 112)
class O112 extends Object
{

}

// 36 - Object 클래스
class Chapter36
{
	// 116. clone
	public static void section116()
	{
		Student116 s1 = new Student116("egoing");
		System.out.println(s1.test());
		try
		{
			Student116 s2 = (Student116)s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

	// 115. finalize
	public static void section115()
	{
		System.out.println("115. finalize");
		System.out.println("garbage collection");
	}

	// 114. equals
	public static void section114()
	{
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

	// 113. toString
	// https://docs.oracle.com/javase/7/docs/api/overview-summary.html
	public static void section113()
	{
		Calculator113 c1 = new Calculator113();
		c1.setOprands(10, 20);
		System.out.println(c1);
		System.out.println(c1.toString());
	}

	// 112. 상속
	public static void section112()
	{
		O112 o = new O112();
		System.out.println(o.getClass());
	}
}

// 35 - 예외3 - 만들기(예제 111)
@SuppressWarnings("serial")
// 클래스의 extends를 따라가 보면 부모클래스에 implements Serializable 객체가 있기 때문입니다.
//  
class DivideException extends Exception
{
	DivideException()
	{
		super();
	}
	DivideException(String message)
	{
		super(message);
	}
}

// 35 - 예외3 - 만들기(예제 111)
class Calculator111
{
	int left, right;
	public void setOprands(int left, int right)
	{
		this.left = left; this.right = right;
	}
	public void divide()
	{
		if(this.right == 0)
		{
			try
			{
				throw new DivideException("0으로 나누는 것은 허용되지 않습니다. ");		
			}
			catch(DivideException e)
			{
				e.printStackTrace();
			}
		}
		System.out.print(this.left/this.right);
	}
}

// 35 - 예외3 - 만들기(예제 109)
class E
{
	void throwArithmeticException()
	{
		throw new ArithmeticException();
	}
	void throwIOException()
	{
		//Unhandled exception type IOException
		// throw new IOException();
		try
		{
			throw new IOException();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

// 35 - 예외3 - 만들기(예제 108)
class Calculator108
{
	int left, right;
	public void setOprands(int left, int right)
	{
		// if(right == 0)
		// {
		// 	throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다. ");
		// }
		this.left = left; this.right = right;
	}
	public void divide()
	{
		if(right == 0)
		{
			throw new ArithmeticException("0으로 나눌 수 없습니다. ");
		}
		try
		{
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다.");			
		}
		catch(Exception e)
		{
			System.out.println("\n\n e.getMessage()\n" + e.getMessage());
			System.out.println("\n\n e.toString()\n" + e.toString());
			System.out.println("\n\n e.printStackTrace()");
			e.printStackTrace();
		}
	}
}

// 35 - 예외3 - 만들기 
class Chapter35
{
	// 111. 나만의 예외 만들기
	public static void section111()
	{
		System.out.println("기본적으로 표준 예외 클래스를 사용한다. ");
		System.out.println("예외를 checked로 할지 unchecked로 할지 결정해야 한다. ");
		System.out.println("예외를 복구할 수 있다면 checked로 선택한다. ");
		System.out.println("사용자에게 예외처리를 강제하는 것이다. ");

		Calculator111 c2 = new Calculator111();
		c2.setOprands(10, 0);
		c2.divide();


	}

	// 110. 예외의 선조 Throwable
	public static void section110()
	{
		System.out.println("java.lang.Object");
		System.out.println("\\_java.lang.Throwable");
		System.out.println("  \\_java.lang.Throwable");
		System.out.println("  |_java.lang.Exception");
		System.out.println("    \\_java.lang.RuntimeException");
		System.out.println("      \\_java.lang.ArithmeticException");

		System.out.println("");
		System.out.println("unchecked 예외: RuntimeException의 하위클래스");
		System.out.println("checked 예외: RuntimeException을 제외한 Exception의 하위클래스");

	}

	// 109. 예외의 여러가지 상황들
	public static void section109()
	{
		E e1 = new E();
		// e1.throwArithmeticException();
		// e1.throwIOException();
		try
		{
			System.out.println("throw ArithmeticException");
			e1.throwArithmeticException();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("throw IOException");
		e1.throwIOException();
	}

	// 108. 예외 만들기
	public static void section108()
	{
		Calculator108 c1 = new Calculator108();
		c1.setOprands(10, 0);
		try
		{
			c1.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}

// 34 - 예외2: 예외 던지기(예제 107)
class B107
{
	void run() throws IOException, FileNotFoundException
	{
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		System.out.println(bReader);
		
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C107
{
	void run() throws IOException, FileNotFoundException
	{
		B107 b = new B107();
		b.run();
	}
}

// 34 - 예외2: 예외 던지기(예제 106)
class B106
{
	void run() {}
}
class C106
{
	void run() 
	{
		B106 b = new B106();
		b.run();
	}
}

// 34 - 예외2: 예외 던지기
class Chapter34
{
	// 107. 책임의 전가 throws
	public static void section107()
	{
		C107 c = new C107();
		try{
			c.run();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("out.txt 파일은 설정 파일입니다.");
			System.out.println("이 파일이 프로젝트 루트 디렉토리에 존재해야 합니다. ");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	// 106. throw와 throws
	public static void section106()
	{
		System.out.println("34 - 예외2: 예외 던지기");
		System.out.println("106. throw와 throws");
		C106 c = new C106();
		c.run();
	}

	// 105. 예외의 강제
	public static void section105()
	{
		// Unhandled exception type FileNotFoundException
		// BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
		// String input = bReader.readLine();
		// System.out.println(input);
		BufferedReader bReader = null;
		String input = null;
		try
		{
			bReader = new BufferedReader(new FileReader("out.txt"));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			input = bReader.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(input);		
	}
}

// 33 - 예외1: 문법(예제 103/104)
class A103
{
	private int[] arr = new int[3];
	A103()
	{
		arr[0] = 0; arr[1] = 10; arr[2] = 20;
	}
	public void z(int first, int second)
	{
		// System.out.println(arr[first]/arr[second]);
		
		try
		{
			System.out.println(arr[first]/arr[second]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(java.lang.ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}

// 33 - 예외1: 문법(예제 102)
class Calculator102
{
	int left, right;
	public void setOprands(int left, int right)
	{
		this.left = left; this.right = right;
	}
	public void divide()
	{
		try
		{
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다.");
			// System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println("\n\n e.getMessage()\n" + e.getMessage());
			System.out.println("\n\n e.toString()\n" + e.toString());
			// Compile Error
			// System.out.println("\n\n e.printStackTrace()\n" + e.printStackTrace());
			System.out.println("\n\n e.printStackTrace()");
			e.printStackTrace();			
		}
	}
}

// 33 - 예외1: 문법(예제 101)
class Calculator101
{
	int left, right;
	public void setOprands(int left, int right)
	{
		this.left = left; this.right = right;
	}
	public void divide()
	{
		// System.out.print("계산결과는 ");
		// System.out.print(this.left/this.right);
		// System.out.print(" 입니다.");

		try
		{
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다.");
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.print("오류가 발생했습니다.:" +e.getMessage());
			System.out.println("");
		}
	}
}

// 33 - 예외1: 문법
class Chapter33
{
	// 104. finally
	public static void section104()
	{
		A103 a = new A103();
		a.z(10,0);
		a.z(1,0);
		a.z(2,1);
	}

	// 103. 다양한 예외들
	public static void section103()
	{
		A103 a = new A103();
		a.z(10,0);
		a.z(1,0);
		a.z(2,1);
	}

	// 102. 뒷수습의 방법
	public static void section102()
	{
		Calculator102 c102 = new Calculator102();
		c102.setOprands(10, 0);
		c102.divide();
	}

	// 101. 예외란?
	public static void section101()
	{
		Calculator101 c101a = new Calculator101();
		c101a.setOprands(10, 0);
		c101a.divide();

		Calculator101 c101b = new Calculator101();
		c101b.setOprands(10, 5);
		c101b.divide();
	}

	// 100. 성공과 실패
	public static void section100()
	{
		System.out.println("33 - 예외1: 문법");
		System.out.println("100. 성공과 실패");
	}
}

// 32 - 다형성(예제 99)
interface father{}
interface mother{}
interface programmer{
	public void coding();
}
interface believer{}

class Steve implements father, programmer, believer
{
	public void coding()
	{
		System.out.println("fast");
	}
}
class Rachel implements mother, programmer
{
	public void coding()
	{
		System.out.println("elegance");
	}
}
// 32 - 다형성(예제 98)
interface I32a
{
	public String A();
}
interface I32b
{
	public String B();
}
class C32 implements I32a, I32b
{
	public String A()
	{
		return "A";
	}
	public String B()
	{
		return "B";
	}
}

// 32 - 다형성(예제 97)
abstract class Calculator32
{
	int left, right;
	public void setOprands(int left, int right)
	{
		this.left = left; this.right = right;
	}
	int _sum()
	{
		return this.left + this.right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run()
	{
		sum(); avg();
	}
}
class Calculator32DecoPlus extends Calculator32
{
	public void sum()
	{
		System.out.println("+ sum: " + _sum());
	}
	public void avg()
	{
		System.out.println("+ avg: " + (this.left + this.right)/2);
	}
}
class Calculator32DecoMinus extends Calculator32
{
	public void sum()
	{
		System.out.println("- sum: " + _sum());
	}
	public void avg()
	{
		System.out.println("- avg: " + (this.left + this.right)/2);
	}
}

// 32 - 다형성(예제 95, 96)
class A32
{
	public String x() {return "A.x";}
}
class B32 extends A32
{
	public String x() {return "B.x";}
	public String y() {return "y";}
}
class BB32 extends A32{
	public String x() {return "BB.z";}
}

// 32 - 다형성(예제 94)
class O
{
	public void a(int param)
	{
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param)
	{
		System.out.println("문자출력");
		System.out.println(param);
	}
}

// 32 - 다형성
class Chapter32
{
	// 99. 인터페이스와 다형성2
	public static void section99()
	{
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();

		employee1.coding();
		employee2.coding();
	}

	// 98. 인터페이스와 다형성1
	public static void section98()
	{
		C32 obj = new C32();
		System.out.println(obj);
		
		I32a objA = new C32();
		I32b objB = new C32();

		System.out.println(obj.A());
		System.out.println(obj.B());
		
		System.out.println(objA.A());
		// objA.B();

		// objB.A();
		System.out.println(objB.B());		
	}

	// 97. 실전 예제(예제 97)
	 public static void execute(Calculator32 cal)
	 {
		System.out.println("실행결과");
		cal.run();
	 }

	// 97. 실전 예제
	public static void section97()
	{
		Calculator32 c1 = new Calculator32DecoPlus();
		c1.setOprands(10, 20);
		
		Calculator32 c2 = new Calculator32DecoMinus();
		c2.setOprands(10, 20);

		execute(c1);
		execute(c2);
	}

	// 96. 클래스와 다형성2
	public static void section96()
	{
		A32 obj = new B32();
		A32 obj2= new BB32();
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}

	// 95. 클래스와 다형성1
	public static void section95()
	{
		A32 obj = new B32();
		System.out.println(obj.x());
		// 클래스 B32를 클래스 A32의 데이터 타입으로 인스턴스화 할 때
		// 클래서 A32에 존재하는 멤버만이 클래스 B32의 멤버가 된다. 
		// System.out.println(obj.y());
	}

	// 94. 메서드와 다형성
	public static void section94()
	{
		O o = new O();
		o.a(1);
		o.a("one");
	}
}

// 31 - 인터페이스(예제 92)
interface I1
{
	public void x();
}

interface I2
{
	public void y();
}

interface I3
{
	public void z();
}

interface I4 extends I3
{
	public void e();
}

class A31 implements I1, I2, I4
{
	public void x(){ System.out.println("x()");}
	public void y(){ System.out.println("y()");}
	public void z(){ System.out.println("z()");}
	public void e(){ System.out.println("e()");}
}

interface Calculatable
{
	public void setOprands(int first, int second, int third);
	public int sum();
	public int avg();
}

class Calculator31 implements Calculatable
{
	int first, second, third;
	public void setOprands(int first, int second, int third)
	{
		this.first = first; this.second = second; this.third = third;
	}
	public int sum()
	{
		return this.first + this.second + this.third;
	}
	public int avg()
	{
		return (this.first + this.second + this.third)/3;
	}
}

class CalculatorDummy implements Calculatable
{
	public void setOprands(int first, int second, int third){}
	public int sum() { return 600;}
	public int avg() { return 200;}
}

class CalculatorConsumer
{
	public CalculatorConsumer()
	{
		// CalculatorDummy c = new CalculatorDummy();
		Calculator31 c = new Calculator31();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}
}

// 31 - 인터페이스(예제 91)
interface I
{
	public void z();
}

// 31 - 인터페이스
class Chapter31
{
	// 93. 인터페이스의 규칙들
	public static void section93()
	{
		System.out.println("93. 인터페이스의 규칙들");
		A31 a31 = new A31();
		a31.x();
		a31.y();
		a31.z();
		a31.e();
	}

	// 92. 인터페이스 - 사용하는 이유
	public static void section92()
	{
		CalculatorConsumer c = new CalculatorConsumer();
		System.out.println(c);
	}

	// 91. 인터페이스 - 문법과 개념
	public static void section91()
	{	
		System.out.println("91. 인터페이스 - 문법과 개념");
	}
}

// 30 - final(예제)
class Calculator30
{
	static final double PI = 3.14;
	int left, right;
	public void setOprands(int left, int right)
	{
		this.left = left; this.right = right;
	}
	public void sum()
	{
		System.out.println(this.left + this.right);
	}
	public void avg()
	{
		System.out.println((this.left + this.right)/2);
	}
}

// 30 - final
class Chapter30
{
	public static void section90()
	{
		Calculator30 c30 = new Calculator30();
		c30.setOprands(10, 20);
		c30.sum();
		c30.avg();
		// The static field ? should be accessed in a static way.
		// System.out.println(c30.PI);
		System.out.println(Calculator30.PI);
	}
}

// 29 - abstract(예시 88)
abstract class Calculator29
{
	int left, right;
	public void setOprands(int left, int right)
	{
		this.left = left; this.right = right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run()
	{
		sum(); avg();
	}
}

class CalculatorDecoPlus extends Calculator29
{
	public void sum()
	{
		System.out.println("+sum: " + (this.left + this.right));
	}
	
	public void avg()
	{
		System.out.println("+avg: " + (this.left + this.right)/2);
	}
}

class CalculatorDecoMinus extends Calculator29
{
	public void sum()
	{
		System.out.println("-sum: " + (this.left + this.right));
	}
	
	public void avg()
	{
		System.out.println("-avg: " + (this.left + this.right)/2);
	}
}

// 29 - abstract(예시 87)
abstract class AA
{
	// public abstract int aa() {System.out.println("Hello");}
	// 메서드의 시그니처만 정의하여 사용한다.
	// 이 메서드의 구체적인 구현은 하위 클래스에서 오버라이딩 해야 한다.
	// 이렇게 내용이 비어있는 메서드를 추상 메서드라고 한다.
	public abstract int bb();
	public void dd()
	{
		System.out.println("world");
	}
}

class BB extends AA{
	public int bb() { return 1; }
}

// 29 - abstract
class Chapter29
{
	// 89. 디자인 패턴
	public static void section89()
	{
		System.out.println("89. 디자인 패턴");
	}

	// 88. 추상 클래스를 사용하는 이유
	// - 상속을 강제하기 위한 것이다. 
	// - 하위 클래스의 책임으로 위임하는 것이다. 
	public static void section88()
	{
		CalculatorDecoPlus c29plus = new CalculatorDecoPlus();
		c29plus.setOprands(10, 20);
		c29plus.run();

		CalculatorDecoMinus c29minus = new CalculatorDecoMinus();
		c29minus.setOprands(10, 20);
		c29minus.run();
	}

	// 87. abstract 문법
	public static void section87()
	{
		BB obj = new BB();
		System.out.println(obj.bb());
		obj.dd();
	}
}

// 28 - 접근 제어자(예제 84)
class Calculator28
{
	private int left, right;
	public void setOprands(int left, int right)
	{
		this.left = left;
		this.right = right;
	}
	private int _sum()
	{
		return this.left + this.right;
	}
	public void sumDecoPlus()
	{
		System.out.println("++++"+_sum()+"++++");
	}
	public void sumDecoMinus()
	{
		System.out.println("----"+_sum()+"----");
	}
	
}

// 28 - 접근 제어자(예제 83)
class A
{
	public String y()
	{
		return "public void y()";
	}

	private String z()
	{
		return "private void z()";
	}

	public String x()
	{
		return z();
	}
}

// 28 - 접근 제어자 
class Chapter28
{
	// 86. 접근 제어자를 사용하는 이유
	public static void section86()
	{
		System.out.println("86. 접근 제어자를 사용하는 이유");
		// public class
		// : 다른 패키지의 클래스에서도 사용 가능
		// default
		// : 같은 패키지에서만 사용 가능
	}

	// 85. 세밀한 제어
	public static void section85()
	{
		Same same = new Same();
		System.out.println(same);

		Other other = new Other();
		System.out.println(other);
	}

	// 84. 접근 제어자를 사용하는 이유
	public static void section84()
	{
		System.out.println("84. 접근 제어자를 사용하는 이유");
		Calculator28 c28 = new Calculator28();
		c28.setOprands(10, 20);
		c28.sumDecoPlus();
		c28.sumDecoMinus();
	}

	// 83. 자유와 규제
	public static void section83()
	{
		System.out.println("83. 자유와 규제");
		A a = new A();
		System.out.println(a.y());
		// System.out.println(a.z());	// Error
		System.out.println(a.x());
	}

	// 82. 접근 제어자
	public static void section82()
	{
		System.out.println("82. 접근 제어자");
	}
}

// 27 - API와 API 문서 보는 법
class Chapter27
{
	// 81. API와 API 문서2
	public static void section81()
	{
		System.out.println("81. API와 API 문서2");
	}

	// 80. API와 API 문서1
	public static void section80()
	{
		System.out.println("80. API와 API 문서1");
		// println: Method
		// out: Field(Member)
		// System: Class
		System.out.println(1);

		// 암시적으로 내포된 필수적인 패키지
		// System 클래스도 java.lang의 소속이다.
		System.out.println("import java.lang.*");
	}
}

// 26 - 패키지
class Chapter26
{
	// 79. 중복의 회피
	public static void section79()
	{
		SelfCompile sc = new SelfCompile();
		System.out.println(sc.getClass());
	}

	// 78. 손 컴파일
	public static void section78()
	{
		System.out.println("78. 손 컴파일");
		System.out.println("javac SelfCompile.java -encoding UTF-8 -d bin");
	}

	// 77. 패키지의 사용
	// 패키지를 만드는 조직이름이나 도메인이름을 사용하는 것이 일반적
	// 
	public static void section77()
	{
		System.out.println("77. 패키지의 사용");
		ClasspathDemo2 pkg = new ClasspathDemo2();
		System.out.println(pkg.getClass());
	}

	// 76. 패키지의 개념
	public static void section76()
	{
		System.out.println("76. 패키지의 개념");
	}
}

// 25 - 클래스 패스
class Chapter25
{
	// 75. 환경변수
	public static void section75()
	{
		System.out.println("75. 환경변수");
	}
	 
	// 73. 클래스의 경로
	public static void section74()
	{
		System.out.println("74. 클래스의 경로");
	}
	
	// 73. 컴파일과 클래스
	public static void section73()
	{
		System.out.println("73. 컴파일과 클래스");
	}
}

// 24 - overloading(예제 72)
class Overloading
{
	void A()			{System.out.println("void A()");}
	void A(int arg1) 	{System.out.println("void A(int arg1)");}
	void A(String arg1)	{System.out.println("void A(String arg1)");}
	int  B()			{System.out.println("int B()"); return 0;}
}

// 24 - overloading(예제 72)
class Calculator24_2
{
	int[] oprands;
	public void setOprands(int [] oprands)
	{
		this.oprands = oprands;
	}

	public void sum()
	{
		int total = 0;
		for(int value: this.oprands)
		{
			total += value;
		}
		System.out.println(total);
	}

	public void avg()
	{
		int total = 0;
		for(int value: this.oprands)
		{
			total += value;
		}
		System.out.println(total/this.oprands.length);
	}
}

// 24 - overloading(예제 71)
class Calculator24_1
{
	int left, right;
	int third = 0;

	public void setOprands(int left, int right)
	{
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right, int third)
	{
		System.out.println("setOprands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}

	public void sum()
	{
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg()
	{
		// System.out.println((this.left + this.right + this.third)/count);
		// 코드 오류로 추가
		int count = 0;
		if(this.left != 0) count++;
		if(this.right != 0) count++;
		if(this.third != 0) count++;

		System.out.println((this.left + this.right + this.third)/count);
	}
}

// 24 - overloading
class Chapter24
{
	// 72. overloading2
	// 
	public static void section72()
	{
		Overloading od = new Overloading();
		od.A();
		od.A(2);
		od.A("coding everybody");
		od.B();
		System.out.println("");

		Calculator24_2 c24_2 = new Calculator24_2();
		c24_2.setOprands(new int[]{10, 20});
		c24_2.sum();
		c24_2.avg();

		c24_2.setOprands(new int[]{10, 20, 30});
		c24_2.sum();
		c24_2.avg();		
	}
	
	// 71. overloading1
	public static void section71()
	{
		Calculator24_1 c24_1 = new Calculator24_1();
		c24_1.setOprands(10, 20);
		c24_1.sum();
		c24_1.avg();
		c24_1.setOprands(10, 20, 30);
		c24_1.sum();
		c24_1.avg();
	}
}

// 23 - overriding(예제)
class SubstractAbleCalculator23 extends Calculator23
{
	public void sum()
	{
		System.out.println("실행 결과는" + (this.left + this.right) + "입니다.");
	}

	public int avg()
	{
		// overriding 사용할 때 동일한 함수의 사용으로 중복발생하면
		// 해당 코드는 부모 객체가 갖고 있는 avg 메서드를 사용한다. 
		return super.avg();
	}

	public void substract()
    {
        System.out.println(this.left - this.right);
    }
}

// 23 - overring(예제)
class Calculator23
{
	int left, right;
	// 그래서 기존 생성자를 만든다. 
	public Calculator23(){}
	// 매개변수가 있는 생성자만 만들게 되면 에러가 발생
    public Calculator23(int left, int right)
    {
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right)
    {
        this.left = left;
        this.right = right;
    }

    public void sum()
    {
        System.out.println(this.left + this.right);
    }

    // public void avg()
    // {
    //     System.out.println((this.left + this.right) / 2);
	// }
	public int avg()
    {
		System.out.println("출력 결과는...");
        return ((this.left + this.right)/2);
    }
}

// 23- overriding
class Chapter23
{
	// 메서드의 이름, 매개변수의 숫자 데이터 타입, 순서
	// 그리고 메서드의 리턴 타입이 같아야 overriding이 된다.
	
	// overriding을 하기 위해서는 부모클래스의 기본 기능에 
	// 자식클래스의 기능을 필요에 따라 변경하는 것이다.

	// overriding를 만든기 위해서는 부모클래스의 매서드의 시그니처와 
	// 자식클래스의 메서드의 시그니처가 동일해야 한다. 

	// 70. Overriding2
	public static void section70()
	{
		SubstractAbleCalculator23 c23_2 = new SubstractAbleCalculator23();
		c23_2.setOprands(10, 20);
		c23_2.sum();
		c23_2.avg();
		System.out.println("실행 결과는" + c23_2.avg());
		c23_2.substract();
	}	
	
	// 69. Overriding1
	public static void section69()
	{
		SubstractAbleCalculator23 c23_1 = new SubstractAbleCalculator23();
		c23_1.setOprands(10, 20);
		c23_1.sum();
		c23_1.avg();
		c23_1.substract();
	}	
}

// 22 - 상속과 생성자(예제)
class SubstractAbleCalculator22 extends Calculator22
{

    public SubstractAbleCalculator22(int left, int right)
    {
		// super: 부모 클래스의 생성자        
        super(left, right);
		// 하위 클래스의 초기화 코드는 항상 super 호츌 뒤에 두어야 한다. 
		// super 생성자 밑으로 초기화 루틴 입력할 것!
    }

    public void substract()
    {
        System.out.println(this.left - this.right);
    }
}

// 22 - 상속과 생성자(예제)
class Calculator22
{
	int left, right;
	// 그래서 기존 생성자를 만든다. 
	public Calculator22(){}
	// 매개변수가 있는 생성자만 만들게 되면 에러가 발생
    public Calculator22(int left, int right)
    {
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right)
    {
        this.left = left;
        this.right = right;
    }

    public void sum()
    {
        System.out.println(this.left + this.right);
    }

    public void avg()
    {
        System.out.println((this.left + this.right) / 2);
    }
}

// 22 - 상속과 생성자
class Chapter22
{
	// 68. super
    public static void section68()
    {
        SubstractAbleCalculator22 c22 = new SubstractAbleCalculator22(10, 20);
        c22.sum();
        c22.avg();
        c22.substract();
	}
	
	public Chapter22()
    {
        System.out.println("기본생성자");
    }

    public Chapter22(int param)
    {
        System.out.println(param);
	}
	
	public void Learn()
	{
		System.out.println("Java Coding");
	}

    // 67. 기본 생성자
    public static void section67()
    {
		Chapter22 ch22 = new Chapter22();
		ch22.Learn();			
    }
}

// 21 - 상속(예제)
class SubstractAbleCalculator extends Calculator
{
	public void substract()
	{
		System.out.println(this.left - this.right);
	}
}

class MultiplicationAbleCalculator extends SubstractAbleCalculator
{
	public void multiplication()
	{
		System.out.println(this.left * this.right);
	}
}

class DivisionAbleCalculator extends MultiplicationAbleCalculator
{
	public void division()
	{
		System.out.println(this.left / this.right);
	}
}

// 21 - 상속
class Chapter21
{
	// 66. 다양한 종류의 상속
	public static void section66()
    {
		// Case 2		
		DivisionAbleCalculator c1 = new DivisionAbleCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		c1.multiplication();
		c1.division();
	}

	// 65. 코드로 알아보는 상속
    public static void section65()
    {
		// Case 2		
		SubstractAbleCalculator c1 = new SubstractAbleCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
	
	// 64. 상속의 개념
    public static void section64()
    {
		// Case 1
		Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        c1.sum();
		c1.avg();
		substract(10, 20); 
    }

    public static int substract(int left, int right)
    {
        System.out.println("Hello");
        return 0;
    }
}

// 20 - 초기화와 생성자(예제)
class Calculator20
{
    int left, right;

    public Calculator20(int left, int right)
    {
        this.left = left;
        this.right = right;
    }

    public void sum()
    {
        System.out.println(this.left + this.right);
    }

    public void avg()
    {
        System.out.println((this.left + this.right)/2);
    }
}

// 20 - 초기화와 생성자
class Chapter20
{
	// 63. 초기화와 생성자
    public static void section63()
    {
        Calculator20 c1 = new Calculator20(10, 20);
        c1.sum();
        c1.avg();

        Calculator20 c2 = new Calculator20(20, 40);
        c2.sum();
        c2.avg();
    }
}

// 19 - 유효 범위(예제)
class C
{
	int v = 10;
	void m()
	{
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}

// 19 - 유효 범위
class Chapter19
{
	// 62. 인스턴스의 유효범위
	public static void section62()
	{
		C c1 = new C();
		c1.m();
	}

    static int n = 5;
    static void a()
    {
		int n = 10;
		n = n + 1;
        b();
    }

    static void b()
    {
        System.out.println(n);
    }

    // 61-2. 다양한 유효범위들
    public static void section61_2()
    {
        b();
	}
	
	// 61-1. 다양한 유효범위들 
    public static void section61_1()
    {
        a3();
        a4();
        // System.out.println(title);
        // System.out.println(i);
    }

    // 61-1. 다양한 유효범위들(예제 포함)
    static void a3()
    {
		String title = "coding everyday";
		title = title + "!";
    }

    // 61-1. 다양한 유효범위들(예제 포함)
    static void a4()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }
	}
	
	// 60. 전역변수와 지역변수 
    static int i;   // 전역 변수(i)
    public static void section60()
    {   
        // 지역변수(i)
        for(i = 0; i < 5; i++)
        {
            a2();
            System.out.println(i);
        }
    }
    
    // 60. 전역변수와 지역변수(예제 포함)
    static void a2()
    {
        i = 0;
	}
	
	// 59. 유효 범위
    public static void section59()
    {   
        for (int i = 0; i < 5; i++)
        {
            a1();
            System.out.println(i);
        }
    }

    // 59. 유효 범위(예제 포함)
    static void a1()
    {
		int i = 0;
		i = i + 1;
        // System.out.println(i);
    }
}

// 18 - 클래스 멤버와 인스턴스 멤버(예제)
class C1
{
	// class member
	static int static_variable = 1;
	// instance member
	int instance_variable = 2;
	
	// class method -> static member access(O)
	static void static_static()
	{
		System.out.println(static_variable);
	}

	// class method -> instance member access(X)
	static void static_instance()
	{
		// System.out.println(instance_variable);
		System.out.println("-");
	}

	// instance method -> class member access(O)
	void instance_static()
	{
		System.out.println(static_variable);
	}

	// instance method -> instance member access(O)
	void instance_instance()
	{
		System.out.println(instance_variable);
	}
}

// 18 - Calculator3 예제
class Calculator3
{
	// Class 메서드
	public static void sum(int left, int right)
	{
		System.out.println(left+right);
	}

	public static void avg(int left, int right)
	{
		System.out.println((left+right)/2);
	}
}

// 18 - Calculator2 예제
class Calculator2
{
	// class 변수
	static double PI = 3.14;
	static int base = 0;

	// instance 변수
	int left, right;

	public void setOperands(int left, int right)
	{
		this.left = left;
		this.right = right;
	}

	public void sum()
	{
		System.out.println(this.left + this.right + base);
	}

	public void avg()
	{
		System.out.println((this.left + this.right + base)/2);
	}
}

// 18 - 클래스 멤버와 인스턴스 멤버
class Chapter18
{
	// 58. 멤버 타입의 비교
	// 1) 인스턴스 메서드는 클래스 멤버에 접근할 수 있다. 
	// 2) 클래스 매서드는 인스턴스 멤버에 접근할 수 없다. 
	public static void section58()
	{
		C1 c = new C1();

		System.out.printf("c.static_static() -> ");
		// c.static_static();
		System.out.printf("\n");
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 정적 메서드가 정적 변수에 접근 -> 성공
		// No Error, but Warning
		
		System.out.printf("c.static_instance() -> ");
		// c.static_instance();
		System.out.printf("\n");
		// 인스턴스를 이용해서 정적 메서드에 접근 -> 성공
		// 정적 메서드가 인스턴스 변수에 접근 -> 실패
		// No Error, but Warning
		
		System.out.printf("c.instance_static() -> ");
		c.instance_static();
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메서드가 클래스 변수에 접근 -> 성공
		// OK
		
		System.out.printf("c.instance_instance -> ");
		c.instance_instance();
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메서드가 인스턴스 변수에 접근 -> 성공
		// OK
		
		System.out.printf("C1.static_static -> ");
		C1.static_static();
		// 클래스를 이용해서 정적 매서드에 접근 -> 성공
		// 정적 메서드가 클래스 변수에 접근 -> 성공 
		// OK
		
		System.out.printf("C1.static_instance -> ");
		C1.static_instance();
		// 클래스를 이용해서 정적 매서드에 접근 -> 성공
		// 정적 메서드가 인스턴스 변수에 접근 -> 실패 
		// Error
		
		System.out.printf("C1.instance_static -> ");
		// C1.instance_static();
		System.out.printf("\n");
		// 클래스를 이용해서 인스턴스 매서드에 접근 -> 실패
		// 인스턴스 메서드가 정적 변수에 접근 -> 성공
		// Error 
		
		System.out.printf("C1.instance_instance -> ");
		// C1.instance_instance();
		System.out.printf("\n");
		// 클래스를 이용해서 인스턴스 매서드에 접근 -> 실패
		// 인스턴스 메서드가 인스턴스 변수에 접근 -> 성공
		// Error 
	}

	// 57. 클래스 메서드
	public static void section57()
	{
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);

		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}

	// 56. 클래스 변수
	public static void section56()
	{
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 20);
		c1.sum();

		Calculator2 c2 = new Calculator2();
		c2.setOperands(20, 40);
		c2.sum();

		Calculator2.base = 10;
		c1.sum();
		c2.sum();
	}

	// 55. 멤버
	public static void section55()
	{
		Calculator2 c1 = new Calculator2();
		// System.out.println(c1.PI);
		// System.out.println(c1.base);
		System.out.println(c1);
		
		System.out.println(Calculator2.PI);
		System.out.println(Calculator2.base);
	}
}

// 17 - Calculator 예제
class Calculator
{
	int left, right;

	public void setOperands(int left, int right)
	{
		this.left = left;
		this.right = right;
	}

	public void sum()
	{
		System.out.println(this.left + this.right);
	}

	public void avg()
	{
		System.out.println((this.left + this.right)/2);
	}
}

// 17 - 클래스와 인스턴스 그리고 객체
class Chapter17
{
	// 54. 객체화3
	public static void section54()
	{
		System.out.println("Calculator - 오브젝트(설계도/클래스 타입)");
		System.out.println("c1 - 인스턴스/객체(상태/변수, 행위/메서드)");
		System.out.println("c2 - 인스턴스/객체(상태/변수, 행위/메서드)");
	}
	
	// 53. 객체화2
	public static void section53()
	{
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();

		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
	}
	
	// 52. 객체화1
	public static void section52()
	{
		int left, right;
		left = 10; right = 20;
		section51_2(left, right); //sum
		section51_3(left, right); //average
	
		left = 20; right = 40;
		section51_2(left, right); //sum
		section51_3(left, right); //average
	}

	// 51-3. 클래스와 인스턴스 이전의 프로그래밍
	// int left, right;
	// left = 10; right = 20;
	// Chapter17.section51_2(left, right); //sum
	// Chapter17.section51_3(left, right); //average

	// left = 20; right = 40;
	// Chapter17.section51_2(left, right); //sum
	// Chapter17.section51_3(left, right); //average
	public static void section51_3(int left, int right)
	{
		System.out.println((left + right)/2);
	}
	
	// 51-2. 클래스와 인스턴스 이전의 프로그래밍
	// Chapter17.section51_2(10, 20);
	// Chapter17.section51_2(20, 40);
	public static void section51_2(int left, int right)
	{
		System.out.println(left + right);
	}
	
	// 51-1. 클래스와 인스턴스 이전의 프로그래밍
	public static void section51_1()
	{
		System.out.println(10 + 20);
		System.out.println(20 + 40);
	}
}

// 16 - 객체 지향 프로그래밍
class Chapter16
{
	// 50. 부품화
	public static void section50()
	{
		System.out.println("[부품화의 장점]");
		System.out.println("1. 은닉화/Information Hiding");
		System.out.println("2. 캡슐화/Encapsulation");
		System.out.println("3. 인터페이스/Interface");
	}
	
	// 49. 추상화
	public static void section49()
	{
		System.out.println("설계 추상화/Design Abstract");
	}

	// 48. 객체 지향 프로그래밍
	public static void section48()
	{
		System.out.println("Object-Oriented Programming");
	}
}

// 15 - 입력과 출력
class Chapter15
{
	// 47. 여러 형태의 입출력
	public static void section47()
	{
		try
		{
			File file = new File("in.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt() * 1000);
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
	}
	
	// 46-2. 앱이 실행 중에 데이터를 입력
	// Chapter15.section46_2(args);
	public static void section46_2(String[] s)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			System.out.println(sc.nextInt() * 1000);
		}
		sc.close();
	}
	
	// 46-1. 앱이 실행 중에 데이터를 입력
	// Chapter15.section46_1(args);
	public static void section46_1(String[] s)
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}
	
	// 45. 앱이 시작할 때 데이터를 입력
	// Chapter15.section45(args);
	public static void section45(String[] s)
	{
		System.out.println(s.length);
		for(String e: s)
		{
			System.out.println(e);
		}
	}
	
	// 44. 입력과 출력
	public static void section44()
	{
	System.out.println("I/O");
	}
}

// 14 - 메서드 
class Chapter14
{
	// 43-2. 메서드의 출력값(return)
	// String[] member = Chapter14.section43_2();
	// System.out.println(members);
	public static String[] section43_2()
	{
		String[] members = {"최진혁", "최유빈", "한이람", "이고잉"};
		return members;
	}
	
	// 43-1. 메서드의 출력값(return)
	//System.out.println(Chapter14.section43_1(1));
	public static String section43_1(int i)
	{
		if(i == 0) return "zero";
		else if(i == 1) return "one";
		else if(i == 2) return "two";
		return "none";
	}
	
	// 42. 메서드의 입력값
	//Chapter14.section42(1,5);
	public static void section42(int init, int limit)
	{
		int i = init;
		while(i < limit)
		{
			System.out.println(i);
			i++;
		}
	}
	
	// 41. 메서드가 없다면
	public static void section41()
	{
		// 재활용, 코드량 , 유지보수
		int i = 0;
		while(i < 5)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();

		i = 0;
		while(i < 5)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();

		i = 0;
		while(i < 5)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
	}
	
	// 40. 메서드의 정의와 호출
	public static void section40()
	{
		int i = 0;
		while(i < 5)
		{
			System.out.println(i);
			i++;
		}
	}
	
	// 39. 메서드 
	public static void section39()
	{
		System.out.println("No code");
	}
}
// 13 - 배열
class Chapter13
{
	// 38. 배열의 오류와 한계
	public static void section38()
	{
		String[] members = new String[3];
		members[0] = "최진혁";
		members[1] = "최유빈";
		members[2] = "한이람";
		// members[3] = "이고잉"; // java.lang.ArrayIndexOutOfBoundsException
		System.out.println("No error");
	}

	// 37. for-each 문
	public static void section37()
	{
		String[] members =  {"최진혁", "최유빈", "한이람", "이고잉"};
		for(String e:members)
		{
			System.out.println(e + "이(가) 출석했습니다. ");
		}
	}
	
	// 36. 배열의 사용
	public static void section36()
	{
		String[] members =  {"최진혁", "최유빈", "한이람", "이고잉"};
		for(int i = 0; i < members.length; i++)
		{
			String member = members[i];
			System.out.println(member + "이(가) 출석했습니다. ");
		}
	}

	// 35. 배열의 제어
	public static void section35()
	{
		String[] classGroup = new String[4];
		System.out.println(classGroup.length);
		classGroup[0] = "최진혁";
		System.out.println(classGroup.length);
		classGroup[1] = "최유빈";
		System.out.println(classGroup.length);
		classGroup[2] = "한이람";
		System.out.println(classGroup.length);
		classGroup[3] = "이고잉";
		System.out.println(classGroup.length);
	}

	// 34. 배열의 개념
	public static void section34()
	{
		String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"};
		System.out.println(Arrays.toString(classGroup));
	}

	// 33. 배열
	public static void section33()
	{
		// self-test
		int[] numbers = {5, 2, 1, 6, 7};
		System.out.println(Arrays.toString(numbers));
	}
}

// 12 - 반복문
class Chapter12
{
	// 32. 반복문의 중첩
	public static void section32()
	{
		// 00 ~ 99
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.println(i + "" + j);
			}
		}
	}
  
	// 31. 반복문의 제어
	public static void section31()
	{
		for(int i = 0; i < 10; i++)
		{
			if(i == 5) break;
			System.out.println("Coding Everybody" + i);
		}

		for(int j = 0; j < 10; j++)
		{
			if(j == 5) continue;
			System.out.println("Everybody Coding" + j);
		}
	}
  
	// 30. 반복문이 없다면
	public static void section30()
	{
		System.out.println("Coding Everybody0");
		System.out.println("Coding Everybody1");
		System.out.println("Coding Everybody2");
		System.out.println("Coding Everybody3");
		System.out.println("Coding Everybody4");
		System.out.println("Coding Everybody5");
		System.out.println("Coding Everybody6");
		System.out.println("Coding Everybody7");
		System.out.println("Coding Everybody8");
		System.out.println("Coding Everybody9");
		
		// for(int i = 0; i < 10; i++)
		// {
		//   System.out.println("Coding Everybody" + i);
		// }
	}

	// 29. for 문 
	public static void section29()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Coding Everybody" + i);
		}
	}

	// 28. while 문 
	public static void section28()
	{
		int i = 0;
		while(i < 10)
		{
			System.out.println("Coding Everybody" + i);
			i++;
		}
	}
}

// 11 - 논리 연산자 
class Chapter11
{
	// 27. NOT 연산자 
	public static void section27()
	{
		// if(!true) System.out.println("False");
		if(!false) System.out.println("True");
	}
	
	// 26. OR 연산자 
	public static void section26()
	{
		System.out.print("Input your id?_\b");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		System.out.print("Input your password?_\b");
		String pw = sc.next();
		sc.close();

		if((id.equals("egoing") || (id.equals("crebiz"))) && (pw.equals("1111")))
		{
			System.out.println("Access OK");
		}
		else
		{
			System.out.println("Access Denied");
		}
	}

	// 25. AND 연산자 
	public static void section25()
	{
		System.out.print("Input your id?_\b");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		System.out.print("Input your password?_\b");
		String pw = sc.next();
		sc.close();

		if(id.equals("egoing") && pw.equals("1111"))
		{
			System.out.println("right");
		}
		else
		{
			System.out.println("wrong");
		}
	}
}

// 10 - 조건문
class Chapter10
{
	// 24. 조건문 switch
	public static void section24()
	{
		System.out.print("Input a integer value?_\b");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		int value = Integer.parseInt(input);
		// System.out.println(value);

		switch(value)
		{
			case 1:
				System.out.println("one");
			break;

			case 2:
				System.out.println("two");
			break;

			case 3:
				System.out.println("three");
			break;

			default:
				System.out.println("the other");
			break;
		}
	}

	// 23. 조건문의 중첩
	public static void section23()
	{
		System.out.print("Input your id?_\b");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		System.out.print("Input your password?_\b");
		String pw = sc.next();
		sc.close();

		if(id.equals("egoing"))
		{
			if(pw.equals("1111"))
			{
				System.out.println("right");
			}
			else
			{
				System.out.println("wrong");
			}
		}
		else
		{
			System.out.println("wrong");
		}
	}

	// 22. 변수와 비교연산자 그리고 조건문
	public static void section22()
	{
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		sc.close();

		//[Original] String id = args[0];
		//[Exercise] String id = "egoing";
		if(id.equals("egoing")) System.out.println("right");
		else                    System.out.println("wrong");
	}

	// 21. 조건문 else
	public static void section21()
	{
		// if(false) System.out.println(1);      // dead code
		// else if(true) System.out.println(2);  
		// else if(true) System.out.println(3);  // dead code
		// else System.out.println(4);           // dead code
		if(true) System.out.println(2); 
	}

	// 20. 조건문 if
	public static void section20()
	{
		if(true)
		{
			System.out.println("1st if condition is True.");
		}

		if(!false)
		{
			System.out.println("2nd if condition is not false.");
		}
	}
}

// 09 - 비교와 Boolean
class Chapter09
{
	// 19. 비교와 Boolean
	public static void section19()
	{
		System.out.println(1==2);   //F
		// System.out.println(1==1);   //T
		System.out.println();

		System.out.println(1!=2);   //T
		// System.out.println(1!=1);   //F
		System.out.println();

		System.out.println(10>20);  //F
		System.out.println(10>2);   //T
		System.out.println(10>10);  //F
		System.out.println();

		System.out.println(10>=20); //F
		System.out.println(10>=2);  //T
		System.out.println(10>=10); //T
		System.out.println();

		String a = "Hello, world";
		String b = new String("Hello, world");
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}

// 08 - 연산자 
class Chapter08
{
	// 18. 연산의 우선순위
	public static void section18()
	{
		int a = 4 - 3 * 6;
		System.out.println(a);
	}

	// 17. 단항 연산자
	public static void section17()
	{
		int i = 3;
		i++;                    //4
		System.out.println(i);  //4
		++i;                    //5
		System.out.println(i);  //5
		System.out.println(i++);//5
		System.out.println(++i);//7
		System.out.println(i);  //7
	}

	// 16. 형 변환
	public static void section16()
	{
		int a = 10;
		int b = 3;

		float c = 10.0F;
		float d = 3.0F;

		System.out.println(a/b);  // 정수/정수
		System.out.println(c/d);  // 실수/정수
		System.out.println(a/d);  // 정수/실수 
	}

	// 15. 산술 연산자
	public static void section15()
	{
		int result = 1 + 2;
		System.out.println(result);

		result = result - 1;
		System.out.println(result);

		result = result * 2;
		System.out.println(result);

		result = result / 2;
		System.out.println(result);

		result = (result + 8) % 7;
		System.out.println(result);

		String first = "This is";
		String second = " a concatenated string.";
		String third = first + second;
		System.out.println(third);
		// Error
		// third = third - second;
		// System.out.println(third);
	}
}

// 07 - 형 변환
class Chapter07
{
	// 14. 명시적 형 변환
	public static void section14()
	{
		// float a = 100.0; // incompatible types: possible lossy coversion from double to float
		// int b = 100.0F; // incompatible types: possible lossy coversion from float to int
		float a = (float)100.0;
		int b = (int)100.0F;

		System.out.println(a);
		System.out.println(b);
	}

	// 13. 형 변환
	public static void section13()
	{
		double a = 3.0F;
		int b = 3;
		float c = 1.0F;
		double d = b + c;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

// 06 - 상수의 데이터 타입
class Chapter06
{
	// 12. 상수의 데이터 타입
	public static void section12()
	{
		//int a = 2.2;  // 실수 default(double)
		double a = 2.2; 
		// float b = 2.2;
		float b = 2.2F;
		// long c = 2147483648; // 정수 default(int)
		long c = 2147483648L;
		// byte d = 300;
		byte d = 100;
		short e = 200;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}

// 05 - 데이터 타입
class Chapter05
{ 
	// 11.데이터 타입의 종류
	public static void section11()
	{
		// Self-test
		Integer i = 123;
		String str = "abc";
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(i.getClass().getName());
		System.out.println(str.getClass().getName());
		System.out.println(list.getClass().getName());
	}
  
	// 10. 데이터의 크기
	public static void section10()
	{
		String str = "데이터의 크기";
		int len = str.length();
		System.out.println(len);
	}
}

// 04 - 주석과 세미콜론
class Chapter04
{
	// 9. 주석과 세미콜론 - Quiz 
	public static void section9()
	{
		// Self-test
		System.out.println("Quiz");
	}

	// 8. 주석과 세미콜론
	public static void section8()
	{
		// Self-test
		// comment
		/*
		comments
		*/
		System.out.println("주석과 세미콜론");
	}
}

// 03 - 변수
class Chapter03
{
	// 7. 변수의 효용
	public static void section7()
	{
		System.out.println(100 + 10);
		System.out.println((100 + 10) / 10);
		System.out.println(((100 + 10) / 10) - 10);
		System.out.println((((100 + 10) / 10) - 10) * 10);
		System.out.println();

		int a = 100;
		System.out.println(a + 10);
		System.out.println((a + 10) / 10);
		System.out.println(((a + 10) / 10) - 10);
		System.out.println((((a + 10) / 10) - 10) * 10);
	}

	// 6. 문자열
	public static void section6()
	{
		String first = "coding";
		System.out.println(first+" "+"everybody");

		String a, b;
		a = "coding";
		b = " everybody";
		System.out.println(a+b);
	}

	// 5. 정수와 실수
	public static void section5()
	{
		int a;
		a = 1;
		System.out.println(a+1);
		a = 2;
		System.out.println(a+1);

		double b = 1.1;
		System.out.println(b+1.1);
		b = 2.1;
		System.out.println(b+1.1);
	}

	// 4. 변수의 선언과 할당
	public static void section4()
	{
		int a;
		a = 1;
		System.out.println(a+1);

		a = 2;
		System.out.println(a+1);
	}
}

// 02 - 숫자와 문자 
class Chapter02
{
	// 3. 문자와 문자열
	public static void section3()
	{
		System.out.println('생');
		System.out.println("생활코딩");
		//문자열을 작은따옴표로 감싸면 에러가 난다.
		//System.out.println('생활코딩');
		System.out.println("생");
		System.out.println("egoing said \"Welcome programming world\"");
		System.out.println("HTML\nCSS\nJavaScript\n");
		System.out.println("생활"+"코딩");
	}

	// 2. 숫자
	public static void section2()
	{
		System.out.println(1+2);
		System.out.println(1.2+1.3);
		System.out.println(2*5);
		System.out.println(6/2);
	}
}

// 01 - 언어 소개 
class Chapter01
{ 
	// 1. Greeting
	public static void section1()
	{
		// Self-test
		System.out.println("Hello world!");
	}
}
