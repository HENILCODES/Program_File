public class exept {
    public static void main(String[] args) {
        Thread T = new Thread();
        T.setName("HH");
        System.out.println(T);
        try{
            for (int i = 0; i < 6; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
