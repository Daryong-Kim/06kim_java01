package ColLesson02;

import java.util.Scanner;

public class ColLesson02 {
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		Word[] words = new Word[10];

		// コマンドラインから入力
		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		//String input = sc.nextLine();

		// ここから記述してください
		// 例えば、「apple  りんご」と入力されたときはtmp[0]に"apple"、tmp[1]に"りんご"が入る
		//String[] tmp = input.split(" ");


		//System.out.println(tmp[0]);
		//System.out.println(tmp[1]);

		int index = 0;
		while(true){
			String input = sc.nextLine();
			if(input.equals("e")){
				break;
			}
			String[] tmp = input.split(" ");
			words[index] = new Word();
			words[index].setEnglish(tmp[0]);
			words[index].setJapanese(tmp[1]);
			index++;
			System.out.println("次の単語を入力してください。\"e\"で終了します。");
		}

		for(int i = 0; i < index; i++){
			System.out.println(
					words[i].toString()
					);
		}

		System.out.println(
				index
				+"件登録しました。");
	}
}
