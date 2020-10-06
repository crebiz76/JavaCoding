// [바로실행] 생활코딩 - 자바(JAVA)
import java.util.ArrayList; // As for Chapter05.section11
import java.util.Scanner;   // As for Chapter10.section22
import java.util.Arrays;    // As for Chapter13.section34
import java.io.*;           // As for Chapter15.section47

class Main
{
	public static void main(String[] args)
	{
		Chapter17.section53();
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
