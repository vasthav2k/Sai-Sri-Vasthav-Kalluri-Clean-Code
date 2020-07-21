package com.epam.CleanCode.Interest;

import java.io.*;
public class InterestApp {
	
	public static void main(String[] args)
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bufferedWriter.write("Enter Principle:");
			bufferedWriter.flush();
			double principle=Double.parseDouble(bufferedReader.readLine());
			
			bufferedWriter.write("Enter rate of Interest:");
			bufferedWriter.flush();
			double rate=Double.parseDouble(bufferedReader.readLine());
			
			bufferedWriter.write("Enter No.of years:");
			bufferedWriter.flush();
			double time=Double.parseDouble(bufferedReader.readLine());
			
			Interest simpleInterest=new SimpleInterest(principle,rate,time);
			bufferedWriter.write("Simple Interest:" + simpleInterest.calculate()+"\n");
			bufferedWriter.flush();
			
			Interest compoundInterest=new CompoundInterest(principle,rate,time);
			bufferedWriter.write("Compound Intertest:"+compoundInterest.calculate()+"");
			bufferedWriter.flush();
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		

		
		
	}

}
