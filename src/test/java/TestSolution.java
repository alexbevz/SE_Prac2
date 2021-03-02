
import org.junit.Assert;
import org.junit.Test;
import ru.bevz.Solution;

public class TestSolution {

//  Пробовал сделать по примеру из лекции, но возникли трудности с определением индекса текущего теста
//	@ParameterizedTest
//	@ValueSource(strings = {
//					"[1,8,6,2,5,4,8,3,7]",
//					"[1,1]",
//					"[4,3,2,1,4]",
//					"[1,2,1]",
//	})

	@Test
	public void TestMaxArea() {
		int[] expecteds = new int[] {49, 1, 16, 2};
		int[][] values = {
						{1, 8, 6, 2, 5, 4, 8, 3, 7, },
						{1, 1, },
						{4, 3, 2, 1, 4, },
						{1, 2, 1, },
		};
		Solution solution = new Solution();
		int[] actuals = new int[expecteds.length];

		for (int i = 0; i < expecteds.length; i++) {
			actuals[i] = solution.maxArea(values[i]);
		}
		Assert.assertArrayEquals(expecteds, actuals);
	}
}
