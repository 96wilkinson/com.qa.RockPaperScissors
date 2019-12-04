package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.qa.enums.RPSChooser;
import com.qa.enums.RPSgame;

class RPSTest {

	@Test
	void testChooser() {
		Assert.assertEquals(1, RPSChooser.getCPU1(),2);
		Assert.assertEquals(1, RPSChooser.getCPU2(),2);

	}

}
