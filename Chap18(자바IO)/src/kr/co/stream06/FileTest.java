package kr.co.stream06;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File directory = new File("C:\\Jiho\\HiMedia\\directory");
		File file1 = new File("C:\\Jiho\\HiMedia\\directory\\file1.txt");
		File file2 = new File("C:\\Jiho\\HiMedia\\directory\\file2.txt");
		
		if (directory.exists() == false) {
			directory.mkdir();			// make directory
		}
		
		if (!file1.exists()) {
			// throws IOException
			file1.createNewFile();
			System.out.println("file1.txt가 생성되었습니다.");	// file1.txt가 생성되었습니다.
		}
		
		if (!file2.exists()) {
			file2.createNewFile();
			System.out.println("file2.txt가 생성되었습니다.");	// file2.txt가 생성되었습니다.
		}
		
		// C:\Jiho\HiMedia\workspace_himedia_java 서브 디렉토리와 파일들을 출력하시오
		File temp = new File("C:\\Jiho\\HiMedia\\workspace_himedia_java\\Chap18(자바IO)");
		File[] files = temp.listFiles();
		
		System.out.println("날짜 \t 시간	\t\t 크기 \t\t 이름");
		System.out.println("===========================================================================");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : files) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			/*
			 * String java.text.DateFormat.format(Date date)
			 * 
			 * java.util.Date.Date(long date)
			 * 
			 * long java.io.File.lastModified()
			 */
			if (file.isDirectory()) {	// 디렉토리인지 여부 테스트
				System.out.println("\t\t<DIR>\t\t" + file.getName());
			} else {
				System.out.println("\t\t" + file.length() + "\t\t" + file.getName());
			}
		}
		/*
			날짜 	 시간			 크기 		 이름
			===========================================================================
			2023-08-02 오후 12:12		396		.classpath
			2023-08-02 오후 12:12		392		.project
			2023-08-02 오후 12:12		<DIR>		.settings
			2023-08-04 오후 12:10		<DIR>		bin
			2023-08-03 오전 11:54		1652102		copyfile.zip
			2023-08-03 오전 11:57		1652102		copyfile2.zip
			2023-08-03 오전 11:53		52353445		copyfile3.zip
			2023-08-03 오전 11:54		52353445		copyfile4.zip
			2023-08-07 오전 01:17		20		data.txt
			2023-08-02 오후 13:13		7		input.txt
			2023-08-02 오후 14:33		26		input2.txt
			2023-08-03 오전 11:46		52353445		jdk-20.0.1_doc-all.zip
			2023-08-06 오후 22:31		3		output.txt
			2023-08-06 오후 22:34		26		output2.txt
			2023-08-06 오후 22:43		10		output3.txt
			2023-08-06 오후 22:44		26		output4.txt
			2023-08-03 오전 10:05		36		reader.txt
			2023-08-07 오전 01:32		103		serial.out
			2023-08-02 오후 12:12		<DIR>		src
			2023-08-03 오전 11:17		1652102		Storyboard.sample.zip
			2023-08-06 오후 22:51		52		write.txt
		 */
	}
}
