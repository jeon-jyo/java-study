package kr.co.thread02;

class PriorityThread2 extends Thread {
	
	@Override
	public void run() {
		int sum = 0;
		
		Thread thread = Thread.currentThread();
		
		System.out.println(thread + " Start!");
		for(int i = 0; i < 1000000; i++) {
			sum += i;
		}
		System.out.println(thread.getPriority() + " End!");
	}
	
}

public class PriorityTest02 {

	public static void main(String[] args) {
		
		int i;
		PriorityThread2 pt1 = new PriorityThread2();
		PriorityThread2 pt2 = new PriorityThread2();
		PriorityThread2 pt3 = new PriorityThread2();
		
		pt1.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
		/*
			Thread[Thread-0,1,main] Start!
			Thread[Thread-2,10,main] Start!
			Thread[Thread-1,5,main] Start!
			10 End!
			5 End!
			1 End!

			우선순위가 높은 게 먼저 스케줄링에서 실행을 해서 먼저 끝남
		 */
	}
}
