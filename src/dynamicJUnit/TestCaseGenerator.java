package dynamicJUnit;

import java.util.List;

import org.junit.runner.RunWith;

/**
 * 動的テストケースクラスを作成するためのInterfaceです。
 *
 * @author tatsuo1234567@gmail.com
 */
@RunWith(dynamicJUnit.DynamicTestsRunner.class)
public interface TestCaseGenerator {
	/**
	 * テストケースのリストを生成します。<br />
	 * 生成したリストは{@link dynamicJUnit.DynamicTestsRunner DynamicTestsRunner}クラスで読み込まれ、<br />
	 * {@link dynamicJUnit.TestCaseGenerator#invokeTestCase invokeTestCase}メソッドで1件づつ実行されます。
	 *
	 * @return TestCaseオブジェクトのリスト
	 */
	public List<TestCase<?, ?>> generateTestCases();

	/**
	 * {@link dynamicJUnit.TestCaseGenerator#generateTestCases generateTestCases}メソッドで生成したTestCaseオブジェクトを読みこんでテストコードを実行します。
	 *
	 * @param TestCaseオブジェクト
	 */
	public <T1, T2> void invokeTestCase(TestCase<T1, T2> testCase);

	/**
	 * このメソッドは実装クラスのテストの実行が始まる前に一度だけ実行されます。
	 */
	public void setUp();

	/**
	 * このメソッドは実装クラスのテストの実行が終わった後に一度だけ実行されます。
	 */
	public void tearDown();
}