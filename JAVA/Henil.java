class ValidName extends Exception{
    public ValidName(String s){
        super(s);
    }
}
class Henil {
    static void Name(String nm) throws ValidName{
        if(nm.isBlank()){
            throw new ValidName("Name Can't Be Blank");
        }
        else{
            throw new ValidName("Succes");
        }
    }
    public static void main(String[] HvP) {
        try{
            Name("Henil");
        }
        catch(ValidName v){
            System.out.println(v);
        }
        finally{
            System.out.println("Complete");
        }
    }
}
