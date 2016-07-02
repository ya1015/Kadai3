package beans;
/**
 * カークラス(抽象クラス)
 */
public abstract class AbstractCar{

	/**
	 * 走る
	 * @return 通常スピード
	 */
	abstract String run();

	/**
	 * 止まる
	 * @return null
	 */
	public void stop(){}

	/**
	 * 走る(例外)
	 * @return 例外スピード
	 */
	abstract String exRun();

}
