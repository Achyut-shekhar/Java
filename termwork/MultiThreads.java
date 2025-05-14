class MyThread extends Thread { String tag;
int count = 0;

MyThread(String tag) { this.tag = tag;
}

public void run() { while (count < 5) {
count++;
System.out.println(tag + " - run: " + count); try {
Thread.sleep(500);
} catch (InterruptedException e) { System.out.println(e);
}
}
}
}

public class MultiThreads {
public static void main(String[] args) { MyThread cs = new MyThread("CSthread"); MyThread it = new MyThread("ITthread");
cs.start();
it.start();
}
}