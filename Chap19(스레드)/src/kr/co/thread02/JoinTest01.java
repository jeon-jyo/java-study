package kr.co.thread02;
/*
 * 1부터 50, 51부터 100까지의 합을 구하는 두 개 Thread를 생성하시오.
 */
public class JoinTest01 extends Thread {

	int start;
	int end;
	int total;
	
	public JoinTest01(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		int i;
		for(i = start; i <= end; i++) {
			total += i;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " Start!");
		
		JoinTest01 jt1 = new JoinTest01(1, 50);
		JoinTest01 jt2 = new JoinTest01(51, 100);
		
		jt1.start();
		jt2.start();
		
		int sum = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("전체 sum = " + sum);
		
		System.out.println(Thread.currentThread() + " End!");
		/*
			Thread[main,5,main] Start!
			jt1.total = 1275
			jt2.total = 3775
			전체 sum = 0
			Thread[main,5,main] End!
			
			구동되고 있는 스레드는 3개 - main, jt1, jt2
		 */
	}
}
