package kr.co.string;

public class StringTextBlockTest {

	public static void main(String[] args) {
		
		/*
		 * 컴파일러, JDK 모두 11 -> 17로 변경
		 * Build Path > Configure Build Path...
		 */
		String textBlock = """
				
				this
				is
				text
				block
				""";
		System.out.println(textBlock);
		/*

			this
			is
			text
			block
		 */
		System.out.println(getHtmlBlock());
		/*
			<html lang="en">
			<head>
			</head>
			<body>
			안녕
			</body>
			</html>
		 */
	}
	
	public static String getHtmlBlock() {
		return """
				<html lang="en">
				<head>
				</head>
				<body>
				안녕
				</body>
				</html>
				""";
	}
}
