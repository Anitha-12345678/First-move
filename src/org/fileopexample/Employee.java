package org.fileopexample;

import java.io.File;
import java.io.IOException;

public class Employee {
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\poly");
		
//	boolean createNewFile=f.createNewFile();
//		System.out.println(createNewFile);
//		
//		boolean canRead=f.canRead();
//		System.out.println(canRead);
//	
//		boolean exists=f.exists();
//				System.out.println(exists);
//		
//		
		//to list out the file which u have created
		String[]list=f.list();
		for (String x: list)
		{
			System.out.println(x);
		}
		
		// to list out the files along with path
		
		File[]listfiles= f.listFiles();
		for( File x1:listfiles)
		{
			System.out.println(x1);
		}
		
		
}

}
