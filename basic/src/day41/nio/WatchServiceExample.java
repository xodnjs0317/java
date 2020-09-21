package day41.nio;


import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WatchServiceExample extends Application{

	class WatchServiceThread extends Thread {
		@Override
		public void run() {
			try {
				WatchService watchService = FileSystems.getDefault().newWatchService();
				Path directory = Paths.get("c:/Temp");
				directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY );
				//c:temp 디렉토리에서 생성, 수정, 삭제 이벤트에 watchservice를 등록
				
				while(true) {
					WatchKey watchKey = watchService.take();
					//watchKey가 큐에 들어올때까지 블로킹
					List<WatchEvent<?>> list = watchKey.pollEvents();
					//watchEvent 목록얻기
					for(WatchEvent watchEvent : list) {
						Kind kind = watchEvent.kind();
						//이벤트 종류 얻기
						Path path = (Path)watchEvent.context();
						//감지된 path 얻기
						if(kind == StandardWatchEventKinds.ENTRY_CREATE) {
							Platform.runLater(()-> textArea.appendText("파일 생성됨 ->"+ path.getFileName()+"\n"));
						}else if(kind == StandardWatchEventKinds.ENTRY_DELETE) {
							Platform.runLater(()-> textArea.appendText("파일 삭제됨 ->"+path.getFileName()+"\n"));
						}else if(kind == StandardWatchEventKinds.ENTRY_MODIFY) {
							Platform.runLater(()-> textArea.appendText("파일 삭제됨 ->"+path.getFileName()+"\n"));
						}else if(kind == StandardWatchEventKinds.OVERFLOW) {
						}
					}
					boolean valid = watchKey.reset();
					if(!valid) {break;}
				}
			} catch(Exception e) {
				
			}
		}
	}
	TextArea textArea;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		textArea = new TextArea();
		textArea.setEditable(false);
		root.setCenter(textArea);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("WatchServiceExample");
		primaryStage.show();
		
		WatchServiceThread wst = new WatchServiceThread();
		wst.start();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
