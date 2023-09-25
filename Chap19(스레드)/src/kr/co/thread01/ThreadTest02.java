package kr.co.thread01;
/*
 * 2. Runnable 인터페이스를 구현하여 생성하는 방법
 *  - run() 메서드 구현
 *  - 객체 참조변수를 인자값으로 하는 Thread를 생성하여 사용
 *  
 * Thread 클래스를 상속받으면 다른 클래스를 상속받을 수 없으므로,
 * 일반적으로 Runnable 인터페이스를 구현하는 방법으로 스레드를 생성
 */
class MyThread2 implements Runnable {
	
	@Override
	public void run() {

		System.out.println(Thread.currentThread() + " Start!");
		
		int i;
		for(i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println(Thread.currentThread() + " End!");
	}
}

public class ThreadTest02 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + " Start!");

		MyThread2 runnable = new MyThread2();
		
		// java.lang.Thread.Thread(Runnable target)
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();
		
		// 3. 익명 내부 클래스
		Runnable anonymousThread = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("anonymous Thread");
			}
		};
		anonymousThread.run();
		
		System.out.println(Thread.currentThread() + " End!");
		/*
			Thread[Thread-0,5,main] Start!
			Thread[Thread-1,5,main] Start!
			0	0	1	1	2	2	3	3	4	4	5	5	6	6	7	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22	23	24	25	26	27	28	29	8	anonymous Thread
			9	10	30	11	Thread[main,5,main] End!
			12	31	32	33	34	35	36	37	38	39	40	41	42	43	44	45	46	47	48	13	49	14	50	15	51	16	52	17	53	54	55	56	57	18	19	20	58	59	21	60	22	23	61	62	63	64	65	66	67	68	24	69	70	25	71	72	73	74	75	76	77	26	27	28	29	30	31	32	33	34	35	36	78	37	38	79	39	40	41	42	43	44	45	80	81	46	47	48	82	83	49	84	50	85	51	86	52	87	53	54	55	88	89	56	57	58	59	60	61	62	63	64	65	66	67	68	69	70	71	72	90	91	92	93	73	94	95	96	97	98	74	99	75	76	100	101	102	103	104	105	106	107	108	77	109	78	110	111	112	113	114	79	115	80	116	81	117	118	119	120	121	122	82	83	84	123	124	125	126	127	128	129	85	130	131	132	133	134	135	136	137	138	139	140	141	142	143	144	145	146	147	148	149	150	151	152	153	154	155	156	157	86	87	158	88	89	159	160	161	162	90	163	164	165	166	167	168	91	92	93	94	95	96	97	98	99	100	101	102	103	104	105	106	107	108	109	110	111	112	113	114	115	116	117	118	119	120	121	122	123	124	125	126	127	128	129	130	131	132	133	134	135	136	137	138	139	140	141	142	143	144	145	146	147	148	149	150	151	152	153	154	155	156	157	158	159	169	170	160	171	172	173	174	175	176	177	178	179	180	181	182	161	162	163	164	165	166	167	168	169	170	171	172	173	174	175	176	177	178	179	180	181	182	183	184	185	186	187	188	189	190	191	192	193	183	184	185	194	195	196	197	198	186	187	188	189	190	191	192	193	194	195	196	197	198	199	
			Thread[Thread-1,5,main] End!
			199	
			Thread[Thread-0,5,main] End!
		 */
	}
}
