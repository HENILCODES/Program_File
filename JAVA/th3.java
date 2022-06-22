class th3 extends Thread {
    String name;
    th3(String s) {
        name = s;
        System.out.println("Thread " + name + " Start");
    }
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(name + " Thread Runing  is " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        th3 p = new th3("One");
        th3 p1 = new th3(" Two ");
        p.start();
        p1.start();
    }
}
