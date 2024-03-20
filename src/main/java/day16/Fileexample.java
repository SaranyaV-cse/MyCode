package day16;

import java.io.File;
import java.io.IOException;

public class Fileexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File ff= new File("D://Java_Training/NewFoldersample/New1/Dec.pdf");


//File[] file1=ff.listFiles();
if(!ff.exists())
{
	try {
		ff.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
/*
 * for(int i=0;i<file1.length;i++) {
 * 
 * System.out.println(file1[i].delete());
 * 
 * }
 */

}
}
