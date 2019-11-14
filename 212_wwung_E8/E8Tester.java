//package animals;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class E8Tester {
	 public static void main(String args[]){
		    org.junit.runner.JUnitCore.main("E8Tester");
		  }
	    Dragon dn = new Dragon();
		Bird br= new Bird();
		Lion ln = new Lion();
		Rabbit rb = new Rabbit();
		

				private final double ERR = 0.01;
		      
				  @Test 
				  public void dragon_calcscore() throws InedibleException { 
					  ArrayList<Animal> an = new ArrayList<Animal>();
						dn.setAcquiredAnimals(an);
						//
						dn.store(new Lion());
						dn.store(new Rabbit());
						dn.store(new Rabbit());
						dn.store(new Bird());
						dn.store(new Bird());
				    
				  assertEquals("Score is incorrect", 1200, dn.calcScore());
				  }
		  
		  @Rule
		  public ExpectedException exceptionRule = ExpectedException.none();
		
		 @Test 
		  public void dragon_calcscore_exception() throws InedibleException { 
			  ArrayList<Animal> an = new ArrayList<Animal>();
			  Dragon dn = new Dragon();
				dn.setAcquiredAnimals(an);
				dn.store(new Dragon());
				dn.store(new Lion());
				dn.store(new Rabbit());
				dn.store(new Rabbit());
				dn.store(new Bird());
				dn.store(new Bird());
				exceptionRule.expect(InedibleException.class);
				exceptionRule.expectMessage("Inedible");
			  dn.calcScore();
					   
		  }
		 
		 @Test
		 public void dragon_store() {
		 		
		 		ArrayList<Animal> bList= new ArrayList<Animal>();
		 		 dn.setAcquiredAnimals(bList);
		 		 dn.store(ln);
		 		       
		        assertEquals((dn.getAcquiredAnimals().contains(dn)),false);
		        assertEquals((dn.getAcquiredAnimals().contains(ln)),true);
		    }
		 
		 
		  @Test 
		  public void lion_calcscore() throws InedibleException { 
			  ArrayList<Animal> an = new ArrayList<Animal>();
				ln.setAcquiredAnimals(an);
				//
				ln.store(new Dragon());
				ln.store(new Rabbit());
				ln.store(new Rabbit());
				ln.store(new Bird());
				ln.store(new Bird());
		    
		  assertEquals("Score is incorrect", 1700, ln.calcScore());
		  }
  
  
  

 @Test 
  public void lion_calcscore_exception() throws InedibleException { 
	  ArrayList<Animal> an = new ArrayList<Animal>();
	  
		ln.setAcquiredAnimals(an);
		ln.store(new Dragon());
		ln.store(new Lion());
		ln.store(new Rabbit());
		ln.store(new Rabbit());
		ln.store(new Bird());
		ln.store(new Bird());
		exceptionRule.expect(InedibleException.class);
		exceptionRule.expectMessage("Inedible");
	  ln.calcScore();
			   
  }
 @Test
 public void lion_store() {
 		
 		ArrayList<Animal> bList= new ArrayList<Animal>();
 		 ln.setAcquiredAnimals(bList);
 		 ln.store(br);
 		       
        assertEquals((ln.getAcquiredAnimals().contains(dn)),false);
        assertEquals((ln.getAcquiredAnimals().contains(br)),true);
    }
 
 @Test 
 public void bird_calcscore() throws InedibleException { 
	  ArrayList<Animal> an = new ArrayList<Animal>();
		br.setAcquiredAnimals(an);
		//
		br.store(new Dragon());
		br.store(new Rabbit());
		br.store(new Rabbit());
		br.store(new Dragon());
		br.store(new Lion());
   
 assertEquals("Score is incorrect", 2700, br.calcScore());
 }




@Test 
public void bird_calcscore_exception() throws InedibleException { 
ArrayList<Animal> an = new ArrayList<Animal>();

br.setAcquiredAnimals(an);
br.store(new Dragon());
br.store(new Lion());
br.store(new Rabbit());
br.store(new Rabbit());
br.store(new Bird());
br.store(new Bird());
exceptionRule.expect(InedibleException.class);
exceptionRule.expectMessage("Inedible");
br.calcScore();
	   
}
@Test
public void bird_store() {
		
		ArrayList<Animal> bList= new ArrayList<Animal>();
		 br.setAcquiredAnimals(bList);
		 br.store(ln);
		       
       assertEquals((br.getAcquiredAnimals().contains(dn)),false);
       assertEquals((br.getAcquiredAnimals().contains(ln)),true);
   }

@Test 
public void rabbit_calcscore() throws InedibleException { 
	  ArrayList<Animal> an = new ArrayList<Animal>();
		rb.setAcquiredAnimals(an);
		//
		rb.store(new Dragon());
		rb.store(new Lion());
		rb.store(new Lion());
		rb.store(new Bird());
		rb.store(new Bird());
  
assertEquals("Score is incorrect", 2500, rb.calcScore());
}

@Test
public void rabit_store() {
		
		ArrayList<Animal> bList= new ArrayList<Animal>();
		 rb.setAcquiredAnimals(bList);
		 rb.store(dn);
		       
       assertEquals((rb.getAcquiredAnimals().contains(dn)),true);
   }


@Test 
public void rabbit_calcscore_exception() throws InedibleException { 
ArrayList<Animal> an = new ArrayList<Animal>();

rb.setAcquiredAnimals(an);
rb.store(new Dragon());
rb.store(new Lion());
rb.store(new Rabbit());
rb.store(new Rabbit());
rb.store(new Bird());
rb.store(new Bird());
exceptionRule.expect(InedibleException.class);
exceptionRule.expectMessage("Inedible");
rb.calcScore();
	   
}
@Test
public void dualTest()
{
	int [][] inputs = {{ 2, 2, 1, 1 }, { 1, 2, 1, 2 },{1, 1, 2, 2,1 },{ 1, 2, 2 },{2,1,2,1,3,3,1,2,2,1,3,3},{}};
    //int[] Par = { 2, 2, 1, 1 };
    //int[] Par = { 1, 1, 2, 2,1 };
    //int[] Par = { 1, 2, 2 };
	  int i=0;
    String [] Pair = {"DUAL","DUAL","NONDUAL","NONDUAL","DUAL","NONDUAL"};
    Dual d= new Dual();
	  for (int [] k:inputs)
	  {
	  
	           assertEquals(Pair[i], Dual.isDual(k).toString());
	           i++;
	  }
      
}

		  /** the lines below are for setting up input/output redirection so that the
		    * tests can see what is being set to the screen as well as produce its own
		    * pseudo-keyboard input.  No test appear below here. */
		  
		  static ByteArrayOutputStream localOut, localErr;
		  static ByteArrayInputStream localIn;
		  static PrintStream sOut, sErr;
		  static InputStream sIn;

		  @BeforeClass public static void setup() throws Exception {
		    sOut = System.out;
		    sErr = System.err;
		    sIn  = System.in;
		  }
		  
		  @AfterClass public static void cleanup() throws Exception {
		    unsetCapture();
		    unsetInput();
		  }
		  
		  private static void setCapture() {
		   localOut = new ByteArrayOutputStream();
		   localErr = new ByteArrayOutputStream();
		   System.setOut(new PrintStream( localOut ) );
		   System.setErr(new PrintStream( localErr ) );
		  }

		  private static String getCapture() {
		   return localOut.toString().replaceAll("\\r?\\n", "\n");
		  }

		  private static void unsetCapture() {
		   System.setOut( null );
		   System.setOut( sOut );
		   System.setErr( null );
		   System.setErr( sErr );
		  }
		  
		  private static void setInput(String input) {
		    localIn = new ByteArrayInputStream(input.getBytes());
		    System.setIn(localIn);
		  }
		  
		  private static void unsetInput() throws IOException {
		    if (localIn != null) localIn.close();
		    System.setIn( null );
		    System.setIn( sIn  );
		  }

}
	
	

