package org.abhijit.javaDemo;

class ParameterizedConstructor 
{
	String name;
	double duration;
	String language;
	
	ParameterizedConstructor(String mname,double dur,String lang) 
	{
		name  = mname;
		duration = dur;
		language = lang;
	}

	public static void main(String[] args) 
	{
		System.out.println("Main started");
		
		ParameterizedConstructor p1=new ParameterizedConstructor("Dhoom", 2.3, "Hindi");
		
		System.out.println("name:"+p1.name);
		System.out.println("duration:"+p1.duration);
		System.out.println("language:"+p1.language);
		
		ParameterizedConstructor p2=new ParameterizedConstructor("Krish", 2, "Hindi");
		
		System.out.println("name:"+p2.name);
		System.out.println("duration:"+p2.duration);
		System.out.println("language:"+p2.language);
		
		
		System.out.println("Main ended");
	}

}
