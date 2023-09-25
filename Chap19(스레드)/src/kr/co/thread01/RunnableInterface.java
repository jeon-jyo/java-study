package kr.co.thread01;

public class RunnableInterface {

	public static void main(String[] args) {
		
		Runnable task = () -> {		// run() 구현
			
			try {
				Thread.sleep(3000);
				/*
				 * - 지정된 millisecond 만큼 대기
				 *  -> 스레드의 실행이 3초 동안 일시 정지 했다가 다시 실행
				 * - InterruptedException 처리 필요
				 */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int sum = 0;
			for(int i = 1; i <= 10; i++) {
				sum += i;
				String name = Thread.currentThread().getName();
				System.out.println(name + " : " + sum);
			}
			
		};
		
		Thread thread = new Thread(task);
		thread.start();
		
		System.out.println("main : " + Thread.currentThread().getName());
		/*
			main : main
			Thread-0 : 1
			Thread-0 : 3
			Thread-0 : 6
			Thread-0 : 10
			Thread-0 : 15
			Thread-0 : 21
			Thread-0 : 28
			Thread-0 : 36
			Thread-0 : 45
			Thread-0 : 55
		 */
	}
}
