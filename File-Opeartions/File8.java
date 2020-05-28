import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File5 {
	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedReader br2 = null;
		try {
			br = new BufferedReader(new FileReader("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt"));

			// One way of reading the file
			System.out.println("Reading the file using readLine() method:");
			String contentLine = br.readLine();
			while (contentLine != null) {
				System.out.println(contentLine);
				contentLine = br.readLine();
			}

