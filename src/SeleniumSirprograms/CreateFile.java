package SeleniumSirprograms;

import java.io.File;

public class CreateFile {
	//file is not creating
	public static void main(String[] args) {
		String path = "d:\\abcasd\\abc";
		File f = new File(path);
		f.mkdir();
		if(f.exists());
		{
			System.out.println("File exists");
		}
		//else
		//{
		//		System.out.println("File not exists");
		//	}
				
		}
		
		
	}



