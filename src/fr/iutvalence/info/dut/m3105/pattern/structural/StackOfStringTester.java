package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {

	private Stack<String> stack;
	
	public StackOfStringTester(Stack<String> stack) {
		this.stack = stack;
	}

	public void logsSize(){
		System.out.println("Size: " + this.stack.size());
	}
	
	private void logDone(){
		System.out.println("Done");
	}
	
	public void logValue(){
		System.out.println("Value peeked:" + this.stack.peek());
	}
	

	public void testStack() {
		this.logsSize();	
		this.stack.push("a");
		this.logDone();
		
		this.logsSize();	
		this.stack.push("b");
		this.logDone();
		
		this.logValue();
		this.logsSize();
		
		System.out.println("Value popped: " +this.stack.pop());
		this.logsSize();
		System.out.println("Value popped: " +this.stack.pop());
		this.logsSize();
		
	}
	
	
	
}
