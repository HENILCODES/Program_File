class ThreadSimple extends Thread {
    public void run(){
        System.out.println("Hello Friends");
    }
    public static void main(String[] args) {
        ThreadSimple T1 = new ThreadSimple();
        T1.start();
    }
    private void start() {
    } 
}
