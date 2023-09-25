package kr.co.member02;

public class MonitorTest {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		
		monitor.power();
		monitor.power();
		monitor.power();
		monitor.power();
		monitor.power();
		monitor.power();
		
		monitor.channel = 20;
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
		monitor.channelDown();
		
	}

}
