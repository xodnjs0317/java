package day38.ex;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Example {
public static void main(String[] args) throws Exception{
	
	String filename = "C:/Temp/file.txt"; 
	byte[] b = new byte[1024]; 
	int len; 
	int counter = 0; 
	DataInputStream in = new DataInputStream(new FileInputStream(filename)); 
	FileWriter fw = new FileWriter("10-0974.txt"); 
	while ((len = in.read(b)) > 0) { 
	  for (int i = 0; i < len; i++) {  
	    System.out.format("%02x ", b[i]); 
	    fw.write( String.format("%02x ", b[i]) ); 
	    counter++; 
	 }  
	 System.out.println(); 
	} 
	fw.close(); 
}
}
