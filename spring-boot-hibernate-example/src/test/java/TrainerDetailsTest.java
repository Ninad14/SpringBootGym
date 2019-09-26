
/*import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;*/

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.devglan.Application;
import com.devglan.controller.TrainerDetailsController;
import com.devglan.model.TrainerDetails;
import com.devglan.service.TrainerDetailsService;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@SuppressWarnings("deprecation")
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = Application.class)

public class TrainerDetailsTest {
	
	public TrainerDetailsTest() {
		
	}
	
	@Autowired
	private TestEntityManager entityManager;
	
	
	
	@Autowired
	private TrainerDetailsService tds;
	
	
	
	 @Test 
	public void getListOfTrainerTest() {
		 
		
		  List<TrainerDetails> listTrainerDetails = tds.getListOfTrainers();
		  assertThat(listTrainerDetails.size() , is(0));
		 
	}
	
}
