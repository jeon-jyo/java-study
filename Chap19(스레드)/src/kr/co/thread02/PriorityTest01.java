package kr.co.thread02;

class PriorityThread extends Thread {
	
	@Override
	public void run() {
		int sum = 0;
		/*
		 * currentThread() 를 실행하는 Thread 인스턴스의 레퍼런스를 반환
		 */
		Thread thread = Thread.currentThread();

		System.out.println(thread + " Start!");
		for(int i = 0; i < 1000000; i++) {
			sum += i;
		}
		System.out.println(thread.getPriority() + " End!");
	}
	
}

public class PriorityTest01 {

	public static void main(String[] args) {
		
		int i;
		for(i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
			PriorityThread pt = new PriorityThread();	// 10개 생성
			pt.setPriority(i);							// 1~10 까지 우선순위를 설정하는것
			pt.start();
		}
		/*
			Thread[Thread-0,1,main] Start!
			Thread[Thread-2,3,main] Start!
			Thread[Thread-4,5,main] Start!
			Thread[Thread-1,2,main] Start!
			Thread[Thread-5,6,main] Start!
			Thread[Thread-6,7,main] Start!
			Thread[Thread-3,4,main] Start!
			Thread[Thread-9,10,main] Start!
			Thread[Thread-8,9,main] Start!
			Thread[Thread-7,8,main] Start!
			8 End!
			10 End!
			6 End!
			7 End!
			9 End!
			3 End!
			5 End!
			1 End!
			2 End!
			4 End!
		 */
	}
}
