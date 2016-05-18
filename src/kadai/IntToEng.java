package kadai;
import java.util.Scanner;

public class IntToEng {

	
	static String[] i = {
	"","one","two","three","four","five","six","seven","eight","nine",
	"ten", "eleven", "twelve", "thirteen", "fourteen",
	"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	};
	
	
    // メインメソッド
    public static void main(String[] args) {
        System.out.println("数字を入力してください。");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
        return "";
    }
}
