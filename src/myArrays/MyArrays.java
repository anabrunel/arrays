package myArrays;

public class MyArrays {
	
	//declare arrays of different types
	
	int[] myIntArray;
	double[] myDoubleArray;
	boolean[] myBooleanArray;
	char[] myCharArray;
	String[] myStringArray;
	Object[] myObjectArray;
		
	/**
	 * OR square brackets after the name
	 * 
	 * int myIntArray[];
	 * double myDoubleArray[];
	 * boolean myBooleanArray[];
	 * char myCharArray[];
	 * String myStringArray[];
	 * Object myObjectArray[];
	 * 
	 **/
	
	/*
		int[] myIntArray = new int[5];
		double[] myDoubleArray = new double[5];
		boolean[] myBooleanArray = new boolean[5];
		char[] myCharArray = new char[5];
		String[] myStringArray = new String[5];
		Object[] myObjectArray = new Object[5];
	*/
	
	MyArrays(){
		
		this.createMyArrays();
		
		this.initialiseMyArrays();
		
		this.printIntArray(this.myIntArray);
		
	}
	
	
	public void printIntArray(int[] arr){
		
		for ( int i = 0; i < arr.length; i++ ){
			
			System.out.println("Element in index: "+ i + " = " + arr[i]);
			
		}
		
	}
	
	private void createMyArrays(){
	
		//create arrays
		
		myIntArray = new int[5];
		myDoubleArray = new double[5];
		myBooleanArray = new boolean[5];
		myCharArray = new char[5];
		myStringArray = new String[5];
		myObjectArray = new Object[5];
				
	}
	
	private void initialiseMyArrays(){
		
		//initialise arrays
		
		myIntArray[0] = 1; myIntArray[1] = 2; myIntArray[2] = 3; myIntArray[3] = 4; myIntArray[4] = 5; 

		int j = 1;
		for (int i = 0; i < myIntArray.length; i++){
		myIntArray[i] = j;
		j++;
		}
		
		myDoubleArray[0] = 0.1; myDoubleArray[1] = 0.2; myDoubleArray[2] = 0.3; myDoubleArray[3] = 0.4; myDoubleArray[4] = 0.5; 

		double k = 0.1;
		for (int i = 0; i < myDoubleArray.length; i++){
		myDoubleArray[i] = k;
		k+=0.1;
		}

		myBooleanArray[0] = true; myBooleanArray[1] = false; myBooleanArray[2] = true; myBooleanArray[3] = false; myBooleanArray[4] = true; 

		boolean l = true;
		for (int i = 0; i < myBooleanArray.length; i++){
		myBooleanArray[i] = l;
		if(l==true){l=false;}
		else{l=true;}
		}
		
		myCharArray[0] = 'h'; myCharArray[1] = 'e'; myCharArray[2] = 'l'; myCharArray[3] = 'l'; myCharArray[4] = 'o'; 

		String m = "hello";
		for (int i = 0; i < myCharArray.length; i++){
		myCharArray[i] = m.charAt(i);
		}

		myStringArray[0] = "one"; myStringArray[1] = "two"; myStringArray[2] = "three"; myStringArray[3] = "four"; myStringArray[4] = "five"; 

		myObjectArray[0] = "one"; myObjectArray[1] = 10; myObjectArray[2] = 0.1; myObjectArray[3] = 'h'; myObjectArray[4] = true;
		
	}
	
	private void createAndInitialise(){
		
		// Shortcut for creating and initialising arrays
		
		int[] anIntArray = {1, 2, 3, 4, 5};

		double[] aDoubleArray = {0.1, 0.2, 0.3, 0.4, 0.5};

		boolean[] aBooleanArray = {true, false, true, false, true};

		char[] aCharArray = {'h', 'e', 'l', 'l', 'o'};

		String[] aStringArray = {"one", "two", "three", "four", "five"};

		Object[] anObjectArray = {"one", 10, 0.1, 'h', true};
	
	}

}
