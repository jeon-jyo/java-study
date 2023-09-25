package kr.co.strategy;
/*
 * 이통사 고객 센터에는 전화 상담을 하는 상담원들이 있습니다.
 * 일단 고객 센터로 전화가 오면 대기열에 저장됩니다.
 * 
 * 상담원이 지정되기 전까지 대기 상태가 됩니다.
 * 각 전화가 상담원에게 배분되는 정책은 다음과 같이 3가지 방식으로
 * 구현될 수 있습니다.
 * 
 *  - 상담원 순서대로 배분하기 (RoundRobin)
 *  - 대기가 짧은 상담원 먼저 배분하기 (LeastJob)
 *  - 우선순위가 높은(숙련도가 높은) 상담원에게 먼저 배분하기 (PriorityAllocation)
 * 
 * 위처럼 다양한 정책이 사용되는 경우 interface 를 정의하고
 * 다양한 정책을 구현하시오
 */
public interface Scheduler {
	
	void getNextCall();
	void sendCallToAgent();

}
