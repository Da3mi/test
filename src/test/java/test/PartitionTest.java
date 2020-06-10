package test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PartitionTest {

	@Test
	public void nominal_partition_test() throws Exception {

		assertEquals(3, MainTestPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 2).size());
		assertEquals(2, MainTestPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 3).size());
		assertEquals(5, MainTestPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 1).size());
	}

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void whenExceptionThrown_thenRuleIsApplied() throws Exception {
		exceptionRule.expect(Exception.class);
		exceptionRule.expectMessage("Size of the list must be bigger than 0");
		MainTestPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 0);
	}
}
