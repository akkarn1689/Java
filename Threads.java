/*
 * Every thread must have a run method
 * 
 * 
 * Thread states:
 * 1. New: start()
 * 2. Runnable: run(); stop()
 * 3. Waiting: sleep(); wait(); notify()
 * 4. Running: sleep(); wait(); stop();
 * 5. Dead
 * 
 * 
 * 
 * 
 */

class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Counter {
    int count = 0;

    public void increment() {
        count++;
    }
}

class Counter2 {
    int count = 0;

    // synchronized keyword ensures that the count is accessed in a synchronized
    // way
    public synchronized void increment() {
        count++;
    }
}

class Threads {
    public static void main(String[] args) throws InterruptedException {
        A objA = new A();
        B objB = new B();

        objB.setPriority(Thread.MAX_PRIORITY);

        // objA.start();
        // objB.start();

        C objC = new C();
        D objD = new D();

        Runnable objE = new C();
        Runnable objF = new D();

        Thread t1 = new Thread(objC);
        Thread t2 = new Thread(objD);
        Thread t3 = new Thread(objE);
        Thread t4 = new Thread(objF);

        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();

        // using lambda expression
        Runnable objG = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Hello...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Counter c = new Counter();
        Counter2 c2 = new Counter2();
        Runnable objH = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
                c2.increment();
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
            }
        };

        Runnable objI = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
                c2.increment();
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
            }
        };

        Thread t5 = new Thread(objH);
        Thread t6 = new Thread(objI);

        t5.start();
        t6.start();

        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        t5.join();
        t6.join();

        System.out.println("Count: " + c.count);
        System.out.println("Counter2: " + c2.count);
    }
}
