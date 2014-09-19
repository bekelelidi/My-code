package agenda;


import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import junit.framework.*;


public class AgendaOnArray {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void ValidateInputDate(String[][] StartEndDate, String[] datesToQuery){
		/*validate if the given input Date is found in the agenda.
		and display true if it is found else print false with the corresponding input Date*/
		System.out.println("========================================" );
		System.out.println(" INPUT                          RESULT");
		System.out.println("========================================" );
		boolean after=false,before=false;
			try{
				for(int i=0; i<datesToQuery.length; i++){
					for(int j=0; j<StartEndDate.length; j++){
						after=false; before=false;
						for(int k=0; k<StartEndDate[0].length; k++){

							SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
							Date date = sdf.parse(StartEndDate[j][k]);
							Date InputDate = sdf.parse(datesToQuery[i]);
				        			        	
							if(k==0 && (InputDate.after(date) || InputDate.equals(date)))
								after=true;
							if(k==1 && (InputDate.before(date)|| InputDate.equals(date)))			
							   before=true;
						 }
						if(after==before==true)
							break;
					 }
						if(after==before==true)          
							System.out.println(datesToQuery[i] + "---------------------> " + "True");
						else 
						System.out.println(datesToQuery[i] + "---------------------> " + "False");
					
				}
	    	}catch(ParseException ex){
	    		ex.printStackTrace();
	    	}
			System.out.println("=========================================" );
	}
	
	
	public static void DisplayAgenda(String[][] StartEndDate){
		 System.out.println("========================================" );
		 System.out.println(" START DATE                    END DATE" );
		 System.out.println("========================================" );
		 
		for(int i=0; i<StartEndDate.length;i++){
			for(int j=0; j<StartEndDate[0].length;j++){
				System.out.print(StartEndDate[i][j] + "                    ");
				}
			System.out.println("\n");
		}
		System.out.print("=========================================" );
		System.out.println("\n\n");
	}
	
	public static void main(String[] args) {
		//Create a String Array
		String[][] StartEndDate={{"2018/02/02", "2019/01/01"},
								 {"2017/02/02","2018/01/01"},	
								 {"2014/01/01", "2015/01/01"}, 
								 {"2015/02/02", "2016/01/01"},
								 {"2016/02/02", "2017/01/01"}};
		//Create a String Array 
		 String[] datesToQuery = {"2014/05/05","2013/01/01",
				 				  "2012/01/01","2016/05/05",
				 				  "2015/01/01","2015/01/02"};

		 //Display the Start and End Date of the Agenda
		 DisplayAgenda(StartEndDate);
		 //Validate the given input date from the DateToQuery Array
		ValidateInputDate(StartEndDate,datesToQuery);
		
		
	}
	
	

}
