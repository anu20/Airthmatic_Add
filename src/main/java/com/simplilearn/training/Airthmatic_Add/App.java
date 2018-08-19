package com.simplilearn.training.Airthmatic_Add;


public class App {

	public float addition(float numa, float numb) {
	    // will return float
	    return numa + numb;
	}

	public float addition(int numa, float numb) {
	    // explicitly cast to int
	    return (float) numa + numb;
	}

	public float addition(float numa, int numb) {
	    // explicitly cast to int
	    return numa + (float) numb;
	}

	public int addition(int numa, int numb) {
	    // will return int
	    return numa + numb;
	}
	public String examineInput(String input1, String input2) {

	    // For both are float
		String ans="Invalid Input";
	    if (input1.indexOf(".") != -1 && input2.indexOf(".") != -1) {
	        try{
		    	float numa = Float.parseFloat(input1);
		        float numb = Float.parseFloat(input2);
		        float ans1=addition(numa, numb);
		        ans = Float.toString(ans1);
	        }
	        catch(Exception e){
	        	ans="Invalid Input";
	        }
	      
	    }

	    // for first to be int and second to be float
	    else if (input1.indexOf(".") == -1 && input2.indexOf(".") != -1) {
	        try{
	        	int numa = Integer.parseInt(input1);
	        	float numb = Float.parseFloat(input2);
	        	float ans1 = addition(numa, numb); 
	        	ans = Float.toString(ans1);
	        }
	        catch(Exception e){
	        	ans="Invalid Input";
	        }
	    }

	    // for first to be float and second to be int
	    else if (input1.indexOf(".") != -1 && input2.indexOf(".") == -1) {
	        try{
	        	float numa = Float.parseFloat(input1);
	        	int numb = Integer.parseInt(input2);
	        	float ans1 = addition(numa, numb);
	        	ans = Float.toString(ans1);
	        }
	        catch(Exception e){
	        	ans="Invalid Input";
	        }
	    }

	    // for both to be int
	    else if (input1.indexOf(".") == -1 && input2.indexOf(".") == -1) {
	        try{
	        	int numa = Integer.parseInt(input1);
	        	int numb = Integer.parseInt(input2);
	        	ans = Integer.toString(addition(numa, numb));
	        }
	        catch(Exception e){
	        	ans="Invalid Input";
	        }
	    }
	    return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println( "Hello World!" );
        App app = new App() ;
        String result=app.examineInput("49.767","65.4089");
        System.out.println(result);
	}
	
	
}
