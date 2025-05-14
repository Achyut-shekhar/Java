class Store { int item;
boolean available = false;

synchronized void produce(int val) { while (available) {
try {
wait();
} catch (Exception e) {}
}
item = val; System.out.println("Produced: " + item); available = true;
notify();
}

synchronized void consume() { while (!available) {
try {
wait();
} catch (Exception e) {}
}
System.out.println("Consumed: " + item); available = false;
notify();
}
}

class Producer extends Thread { Store s;

Producer(Store s) { this.s = s;
}

public void run() {
for (int i = 1; i <= 5; i++) { s.produce(i);
try {
Thread.sleep(500);
} catch (Exception e) {}
}
} 
}

class Consumer extends Thread { Store s;

Consumer(Store s) { this.s = s;
}

public void run() {
for (int i = 1; i <= 5; i++) { s.consume();
try {
Thread.sleep(500);
} catch (Exception e) {}
}
}
}
public class Main {
public static void main(String[] args) { Store s = new Store();
new Producer(s).start(); new Consumer(s).start();
}
} 
