package Test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wd.entity.User;
import com.wd.service.user.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext-*.xml"})
public class UserTest {
	@Resource IUserService userService;
	
	@Test
	public void testAddUser() {
		User user = new User();
		user.setU_name("zhengbin1");
		user.setU_pwd("950906");
		user.setU_issell(0);
		user.setU_money(100000);
		userService.addUserService(user);
	}
	
	@Test
	public void testEditUserMoney() {
		int u_id = 2;
		int u_money = 100;
		System.out.println(userService.editUserMoneyService(u_id, u_money));
	}
	
	@Test
	public void testGetMoney() {
		int u_id = 2;
		System.out.println(userService.getUserMoneyService(u_id));
	}
	
	public static void main(String[] args) {
		String str = "-20:-20";
		System.out.println(str.charAt(str.length()-3));
	}
	
}
