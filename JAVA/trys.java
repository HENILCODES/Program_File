class exet extends Exception{
    exet(String msg){
        super(msg);
    }
}
class trys{
    public static void name(String n) throws exet {
        if(n.length()<8){
            throw new exet("less");
        }
    }
    public static void main(String[] args) {
       System.out.println("Hello");
       try{
           name("Henil");
       }
       catch(Exception s){
           System.out.println(s);
       }
       finally{
           System.out.println("Finsh");
       }
    }
}