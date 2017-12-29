package SeleniumSirprograms;

import java.io.File;

public class FileHandleExe1 {

	public static void main(String[] args) {

		String path = "E://Temp123";
		File f = new File(path);
		f.mkdir();
		//f.delete();
		if(f.exists())
	{
			System.out.println("Folder presents");
		}
		

	}

}
