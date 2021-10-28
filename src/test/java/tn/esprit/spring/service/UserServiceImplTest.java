
package tn.esprit.spring.service;

 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

		@Autowired
		IUserService us; 
	
		@Test
		public void testRetrieveAllUsers() {
			List<User> listUsers = us.retrieveAllUsers(); 
			// if there are 7 users in DB : 
<<<<<<< HEAD
			Assert.assertEquals(8, listUsers.size());
=======
			Assert.assertEquals(12, listUsers.size());
>>>>>>> 9e71e8fe9db68f3ee4ee5931e95e458dc7421a78
		}
		
		
		@Test
		public void testAddUser() throws ParseException {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date d = dateFormat.parse("2015-03-23");
			User u = new User("Mayssa1", "Mayssa1", d, Role.INGENIEUR); 
			User userAdded = us.addUser(u); 
			Assert.assertEquals(u.getLastName(), userAdded.getLastName());
		}
	 
		@Test
		public void testModifyUser() throws ParseException   {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date d = dateFormat.parse("2015-03-23");
			User u = new User(10L, "Mayssa122222222", "Mayssa", d, Role.INGENIEUR); 
			User userUpdated  = us.updateUser(u); 
			Assert.assertEquals(u.getLastName(), userUpdated.getLastName());
		}
	
		@Test
		public void testRetrieveUser() {
			User userRetrieved = us.retrieveUser("7"); 
			Assert.assertEquals(7L, userRetrieved.getId().longValue());
		}
		
		@Test
		public void testDeleteUser() {
<<<<<<< HEAD
			us.deleteUser("10");
			Assert.assertNull(us.retrieveUser("11"));
=======
			us.deleteUser("30");
			Assert.assertNull(us.retrieveUser("30"));
>>>>>>> 9e71e8fe9db68f3ee4ee5931e95e458dc7421a78
		}
		
		// 5 tests unitaires  
		//JUST ADD 1 TO THE ID YOU WOULD LIKE TO DELETE
 
}





