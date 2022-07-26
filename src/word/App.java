package word;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {					
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {					
					System.out.println("World");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						return;
					}
				}	
			}
		});
		
		thread1.start();
		thread2.start();
	}
}
