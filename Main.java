// [바로실행] 생활코딩 - 자바(JAVA)
class Main
{
  public static void main(String[] args)
  {
    Chapter02.section3();
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
