package agenda;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AgendaTest {

	@Test
	public void testValidateInputDate() {
		  Result result = JUnitCore.runClasses(AgendaOnArray.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	   
	}

	@Test
	public void testDisplayAgenda() {
		  Result result = JUnitCore.runClasses(AgendaOnArray.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	}

}
