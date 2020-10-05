// [바로실행] 생활코딩 - 자바(JAVA)
import java.util.ArrayList; // As for Chapter05.section11

class Main
{
  public static void main(String[] args)
  {
    Chapter08.section18();
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
