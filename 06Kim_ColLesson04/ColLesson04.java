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
			String[] tmp = input.split(" ");
			words.setEnglish(tmp[0]);
			words.setJapanese(tmp[1]);
			index++;
			System.out.println("次の単語を入力してください。\"e\"で終了します。");
		}

		for(int i = 0; i < index; i++){
			System.out.println(
					words[i].toString()
					);
		}

		/*System.out.println(
				index
				+"件登録しました。");*/
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
			for(int j = 0; j < index; j++){
				System.out.println(
						words[j].toString()
						);
			}
		}
		System.out.println(
				index
				+"件登録しました。");
	}
}
