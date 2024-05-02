abstract class Sample{
	abstract void funSampleAbstract();
	void Fun(){
	}
	
}
class Demo1 extends Sample{
	void funSampleAbstract(){
		System.out.println("Inside Demo1");
	}
}
class Relate 
{
	public static void main(String args[]){
		Demo1 s = new Demo1();
		s.funSampleAbstract();
	}
}


























/* class ExampleThread extends Thread {
    public void run() {
        try {
            // Simulate some task
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }

    public static void main(String[] args) {
        ExampleThread thread = new ExampleThread();
        thread.start();

        // Interrupt the thread after 2 seconds
        try {
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}*/

