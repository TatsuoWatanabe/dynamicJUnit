package dynamicJUnit.samples;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;

import dynamicJUnit.DynamicTestsRunner;
import dynamicJUnit.TestCase;
import dynamicJUnit.TestCaseGenerator;

/**
 * 動的テストケース作成機能を使ったFizzBuzzのテストです。<br />
 * TestCaseクラスのコンストラクタを使用してInstanceを生成します。
 *
 * @author tatsuo1234567@gmail.com
 */
@RunWith(DynamicTestsRunner.class)
public class FizzBuzzTest implements TestCaseGenerator {

	@Override
	public List<TestCase<?, ?>> generateTestCases(){
		List<TestCase<?, ?>> cases = new ArrayList<TestCase<?, ?>>();
		String format = "検証値: [%2$s] の時、実測値が[%1$s] であること。";

		for(int i = 1; i <= 1000; i++) {
			Object expected =
				(i%15 == 0) ? "FizzBuzz":
				(i%5  == 0) ? "Buzz":
				(i%3  == 0) ? "Fizz": i;
			Integer param = i;
			cases.add(new TestCase<Object, Integer>(format, expected, param));
		}
		return cases;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T1, T2> void invokeTestCase(TestCase<T1, T2> testCase) {
		if(testCase.param instanceof Integer) {
			Integer paramInt = (Integer)testCase.param;
			T1 actual = (T1)getFizzBuzz(paramInt); //actual(実測値)を取得
			assertThat(testCase.name, actual, is(testCase.expected));
		} else {
			fail("invalid data type.");
		}
	}

	/**
	 * @param i Integer
	 * @return Object String or Integer
	 */
	private Object getFizzBuzz(Integer i) {
		return  (i%15 == 0) ? "FizzBuzz":
				(i%5  == 0) ? "Buzz":
				(i%3  == 0) ? "Fizz": i;
	}

	@Override
	public void setUp() {}

	@Override
	public void tearDown() {}

}
