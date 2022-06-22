class th1 extends Thread {
    public void run(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        th1 s =new th1();
        s.start();
    }
}