class FooBar {
    private int n;

    Semaphore fooo = new Semaphore(1);
    Semaphore barr = new Semaphore(0);
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            fooo.acquire();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            barr.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            barr.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            fooo.release();
        }
    }
}