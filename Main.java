// [바로실행] 생활코딩 - 자바(JAVA)
import java.util.ArrayList; // As for Chapter05.section11
import java.util.Scanner;   // As for Chapter10.section22

class Main
{
  public static void main(String[] args)
  {
    Chapter12.section29();
  }
}

// 12 - 반복문
class Chapter12
{
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
    if(!true) System.out.println("False");
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
    if(false) System.out.println(1);      // dead code
    else if(true) System.out.println(2);  
    else if(true) System.out.println(3);  // dead code
    else System.out.println(4);           // dead code
  }
  
  // 20. 조건문 if
  public static void section20()
  {
    if(true)
    {
      System.out.println("1st if condition is True");
    }

    if(false)
    {
      System.out.println();
    }
    else
    {
      System.out.println("2nd if condition is false");
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
    System.out.println(1==1);   //T
    System.out.println();
    
    System.out.println(1!=2);   //T
    System.out.println(1!=1);   //F
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
