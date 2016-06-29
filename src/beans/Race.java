package beans;
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
	private boolean eRest_flag = false;
	/**
	 * コンストラクタ
	 */
	public Race(){

	}
}
