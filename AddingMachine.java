package cse360assign2;

public class AddingMachine {
	
	private int total; //total value of adderMachine
	private String temp; //temp for adding strings
	private String temp2; //temp for converting int to string
	
	
	public AddingMachine()
	{
		//initializing variables
		total=0;
		temp="0 ";
		temp2="";
		
		//for clarity
	}
	public int getTotal() //returns total value 
	{
		return total;
	}
	
	public void add(int value) //adds value to current total
	{
		toString(value);
		total+=value;
	}
	
	public void subtract(int value) //subtracts value from current total
	{
		toString(-value); //sends negative value to function to indicate being subtracted
		total-=value;
	}
	
	public String toString(int value) // returns history of values as a string, if added 2+2 using add(), will return 2+2 as string
	{
			
		if(value<0) //checks if being subtracted;
		{
			value=value *-1; //changes val back to positive val for future reference
			temp2=Integer.toString(value); //parses int to string
			temp=temp + "- "+value + " "; //adds new string with new val to current history string with indication of subtraction
		}
		else 
		{
			temp2=Integer.toString(value); //parses int to string
			temp=temp + "+ "+value + " ";  //adds new string with new val to current history string with indication of subtraction
		}
		return temp;
		
	}
	
	public void clear()
	{
		
	}

}
