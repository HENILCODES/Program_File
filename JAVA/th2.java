class th2 implements Runnable {
    Thread td =new Thread();
    public void run() {
        System.out.println("Thread Current : "+td);
        td.setName("Henil");
        System.out.println("Change name Thread Name : "+td.getName());
        td.setPriority(9);
        System.out.println("Change Thread Priority: "+td.getPriority());
        System.out.println("Exit");
    }
    public static void main(String args[]) {
        th2 s =new th2();
        Thread t =new Thread(s);
        t.start();
    }
}