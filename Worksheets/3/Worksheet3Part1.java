public class Worksheet3Part1 {//beginning of the class.

public static void main (String []args){// begining of the class.

String verbPhrase = "is money"; 
System.out.println("Time" + verbPhrase); // time is money
String test = "abcdefg";
System.out.println(test.length());//7
System.out.println(test.charAt(1));//b
String test2 = "abcdefg";
System.out.println(test.substring(3));//defg
System.out.println("abc\ndef");//abc over defg
System.out.println("abc\\ndef");//def abc/ndefg
String test3 = "Hello Tony";

String test4 = test3.toUpperCase();// should use " String " class at the begining of "test4".
System.out.println(test4);// it prints out "HELLO TONY".
System.out.println("2 + 2 = " + (2 + 2));//it prints out "4"
System.out.println("2 + 2 = " + 2 + 2);// it prints out "22"
}// end of the main method.
}// end of class.