package beans;

import java.util.ArrayList;

/**
 * レースクラス
 */
public class Race {
	/** 電気自動車の走行を表す文字列 */
	private String etext = "";
	/** バスの走行を表す文字列 */
	private String btext = "";
	/** スーパーカーの走行を表す文字列 */
	private String stext = "";
	/** F5を押された回数を数えるカウンター */
	private int counter;
	/** 休憩を表すフラグ */
	private boolean rest_flag = false;

	/**
	 * レースの結果を返す
	 */
	public ArrayList<String> returnRace() {

		ArrayList<String> race = new ArrayList<String>();

		// インスタンス生成
		AbstractCar e = new ElectricCar();
		AbstractCar b = new Bus();
		AbstractCar s = new SuperCar();

		// 走る
		// counterが5になったときに1回休み、2分の1の確率で復活
		if (counter % 5 != 0) {
			etext += e.run();
		} else {
			rest_flag = true;
		}
		if (counter % 5 != 0 && rest_flag) {
			if (Math.random() <= 0.5)
				rest_flag = !rest_flag;
		}

		// couterが3になったときに1回休み、10分の3の確率で2.5倍の速さ
		if (counter % 3 != 0) {
			if (Math.random() <= (10 / 3)) {
				btext += b.exRun();
			} else {
				btext += b.run();
			}
		}

		// 2分の1の確率で休み、5分の1の確率で1.5倍の速さ
		if (Math.random() <= 0.5) {
			if (Math.random() <= 0.2) {
				stext += s.exRun();
			}else{
				stext += s.run();
			}
		}

		race.add(etext);
		race.add(btext);
		race.add(stext);

		counter++;
		System.out.println(counter);

		return race;
	}
}
