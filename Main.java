// [바로실행] 생활코딩 - 자바(JAVA)
import java.util.ArrayList; // As for Chapter05.section11

class Main
{
  public static void main(String[] args)
  {
    Chapter05.section11();
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
