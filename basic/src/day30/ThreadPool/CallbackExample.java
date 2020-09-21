package day30.ThreadPool;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	private ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		//void는 반환할 형식이 없을때 지정
	    //void의 위치에는 보통 추가적으로 전달할 객체를 지절할때 넣어줍니다.
		
		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행 :"+result);
		}
		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed()실행 :"+ exc.toString());
		}
	};
	
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX +intY;
					callback.completed(result, null);
				} catch(NumberFormatException e) {
					callback.failed(e, null);
				}
			}
		};
	executorService.submit(task);
	}
	
	public void finish() {
		executorService.shutdown();
	}
	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "삼");
		example.finish();
	}
}
