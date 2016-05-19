package kadai;
import java.util.Scanner;
import java.io.*;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {
        System.out.println("数字を入力してください。");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) throws NumberFormatException {
    		final String[] eNum1 = {"zero", "one", "two", "three", "four",
    		"five", "six", "seven", "eight", "nine",
    		"ten", "eleven", "twelve", "thirteen", "fourteen",
    		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    		StringBuffer number = null;
    		String input=null;
    		int num = Integer.parseInt(input);
    		if (num < 0 || num > 99) {
    		throw new NumberFormatException();
    		}
    		if (num < 20) {
    		number = new StringBuffer(eNum1[num]);
    		} else {
    		final String[] eNum2 = {"twenty", "thirty", "forty", "fifty", "sixty",
    		"seventy", "eighty", "ninety"};
    		number = new StringBuffer(eNum2[input.charAt(0) - 50]);
    		if (input.charAt(1) != '0') {
    		number.append("-").append(eNum1[input.charAt(1) - 48]);
    		}
    		}
    		return number.toString();
        //return "";
    }
}
