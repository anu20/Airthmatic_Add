package com.simplilearn.training.Airthmatic_Add;


import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import junit.framework.Test.*;
import com.simplilearn.training.Airthmatic_Add.App;

public class AppTest {
	private App app ;
	
	@Before
	public void setup() {
		app = new App() ;
	}

	@Test
	public void numberOne() {
		Assert.assertEquals("13", app.examineInput("6","7")) ;
	}
	
	@Test
	public void numberTwo() {
		Assert.assertEquals( "16.9", app.examineInput("8.5","8.4") ) ;
	}
	
	@Test
	public void numberThree() {
		Assert.assertEquals( "26.4089", app.examineInput("8","18.4089") ) ;
	}
	
	@Test
	public void numberFour() {
		Assert.assertEquals( "115.175896", app.examineInput("49.767","65.4089") ) ;
	}
	
	@Test
	public void numberFive() {
		Assert.assertEquals( "Invalid Input", app.examineInput("--","65.4089") ) ;
	}
	
	@Test
	public void numberSix() {
		Assert.assertEquals( "Invalid Input", app.examineInput(" ","9") ) ;
	}
	
	@Test
	public void numberSeven() {
		Assert.assertEquals( "Invalid Input", app.examineInput("","") ) ;
	}
	
	@Test
	public void numberEight() {
		Assert.assertEquals( "Invalid Input", app.examineInput("7","8/9") ) ;
	}

}
