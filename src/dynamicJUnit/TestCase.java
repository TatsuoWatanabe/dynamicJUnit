package dynamicJUnit;

import java.util.ArrayList;
import java.util.List;

/**
 * テストケース1件単位でのデータ格納用のクラスです。{@link dynamicJUnit.DynamicTestsRunner DynamicTestsRunner}で実行するための
 * テストケースの作成に使用します。<br />
 * T1 は期待値のデータ型を格納します。<br />
 * T2 はテストメソッドの引数のデータ型を格納します。
 *
 * @author tatsuo1234567@gmail.com
 */
public class TestCase<T1, T2> {
	public final String name;
	public final T1 expected;
	public final T2 param;

	/**
	 * TestCaseクラスのコンストラクタです。
	 * 引数formatに書式指示子を渡すことでexpectedの値・paramsの要素をテスト名に含めることができます。
	 *
	 * @param format テスト名。
	 * @param expected 期待値。
	 * @param param テストメソッドの引数。
	 */
	public TestCase(String format, T1 expected, T2 param) {
		this.name = String.format(format, expected, param);
		this.expected = expected;
		this.param = param;
	}

	/**
	 * パラメータの配列から複数のTestCaseクラスのInstanceを生成するファクトリメソッドです。<br />
	 * 引数formatに書式指示子を渡すことでparamsの要素・expectedの値をテスト名に含めることができます。
	 *
	 * @param format テスト名の書式文字列。{@link java.lang.String#format String.format}メソッドにparamsの要素・expectedの値と共に渡される。
	 * @param expected テストケースの期待値。
	 * @param params テストメソッドの引数の配列。
	 * @return TestCaseクラスのInstanceのリスト。
	 * @see java.util.Formatter
	 */
	public static <T1, T2> List<TestCase<?, ?>> createByParams(String format, T1 expected, T2[] params) {
		List<TestCase<?, ?>> cases = new ArrayList<TestCase<?, ?>>();
		for(T2 param : params) cases.add(new TestCase<T1, T2>(format, expected, param));
		return  cases;
	}
}
