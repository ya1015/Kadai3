package beans;
/**
 * スーパーカーを表すクラス
 */
public class SuperCar extends AbstractCar{
	/** スピードを表す文字列 */
	private String speed = "＝＝＝＝";
	/** 例外スピードを表す文字列 */
	private String ex_speed = "＝＝＝＝＝＝";

	@Override
	String run() {
		return this.speed;
	}

	@Override
	String exRun() {
		return this.ex_speed;
	}

}
