package FirstO;

public class First {
	public static void main(String args[])   
	{  
	String st="India";  
	int i, length;  
	int counters[] = new int[150];  
	  
	
	
	 
	length= st.length();  
	
	for (i = 0; i < length; i++)   
	{  
	counters[(int) st.charAt(i)]++;  
	}  
	
	for (i = 0; i < 150; i++)   
	{  
	if (counters[i] != 0)   
	{  
	   
	System.out.println((char) i + " = " + counters[i]);  
	}  
	}  
	}

}
