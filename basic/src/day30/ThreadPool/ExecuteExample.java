package day30.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public static void main(String[] args) throws Exception{
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//최대 스레드 개수가 2인스레드풀 생성
		for(int i =0;i<10;i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor =
							(ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
							String threadName = Thread.currentThread().getName();
							System.out.println("[총 스레드 개수:"+poolSize+"]작업 스레드 이름 : " +threadName);
							int value = Integer.parseInt("샴");
				}			//예외발생    
			};
			
			executorService.execute(runnable); //작업처리요청
		    //executorService.submit(runnable);  
		    //차이점은 실행후 예외가 일어나면 submit는 예외가 일어나도 스레드를 종료시키지 않고 재활용하는 반면에 execute는 예외가 일어나면 스레드를 종료합니다.
			Thread.sleep(10);
		}
		executorService.shutdown(); //스레드풀 종료
		//스레드 풀의 경우 main이 종료되도 계속 실행 상태로 남아있기 때문에 main이 종료되기 전에 항상 종료 시켜주어야합니다.
	}
}
