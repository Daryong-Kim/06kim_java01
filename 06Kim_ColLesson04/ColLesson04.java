package ColLesson04;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		ArrayList<Word> words = new ArrayList<Word>();

		// コマンドラインから入力
		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);

		// ここから記述してください
		// 例えば、「apple  りんご」と入力されたときはtmp[0]に"apple"、tmp[1]に"りんご"が入る


		int index = 0;

		try{
		while(true){
			String input = sc.nextLine();
			if(input.equals("e")){
				break;
			}
			String[] tmp = new String[2];
			tmp = input.split(" ");
			Word wd = new Word(tmp[0], tmp[1]);
			words.add(wd);
			index++;
			System.out.println("次の単語を入力してください。\"e\"で終了します。");
		}


		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
		}

		for(Word wd : words){
			System.out.println(wd);
		}
		System.out.println(
				index
				+"件登録しました。");
	}
}
