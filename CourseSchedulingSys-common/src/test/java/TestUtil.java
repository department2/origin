import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.course.util.GetNaturalPrimaryKeyUtil;

public class TestUtil {
	
	@Test
	public void testGetKey() {
		String key = GetNaturalPrimaryKeyUtil.getKey("student");
		System.out.println(key);
	}
	
	
}
