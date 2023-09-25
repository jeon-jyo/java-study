package kr.co.thread01;
/*
 * 두 개 스레드 동시 실행
 *  - 20 미만 짝수 출력
 *  - 10 미만 수 출력 (9부터 1까지)
 */
public class MultiThreadTest {

	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			// 20미만 짝수 출력
			for(int i = 2; i < 20; i = (i+2)) {
				System.out.print(" " + i + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable task2 = () -> {
			// 10 미만 수 출력 (9부터 1까지)
			for(int i = 1; i < 10; i++) {
				System.out.print(" (" + i + ") ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		thread1.start();	// 0 2 4 6 8 10 12 14 16 18 
		thread2.start();	// 1 2 3 4 5 6 7 8 9 
		/*
		 *  (1)  0  (2)  2  (3)  (4)  4  (5)  (6)  6  (7)  (8)  8  (9)  10  12  14  16  18 
		 */
	}
}
