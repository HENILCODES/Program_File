class StringFunction{
    public static void main(String[] args) {
        String H1 = "Henil";
        String H2 = " Prajapati ";
        System.out.println(H1.charAt(1));
        System.out.println(H1.concat(H2));
        System.out.println(H1.equals(H2));
        System.out.println(H2.indexOf("a"));
        System.out.println(H2.isEmpty());
        System.out.println(String.join(" / ", "15","02","2003"));
        System.out.println(H2.lastIndexOf("a"));
        System.out.println(H2.length());
        System.out.println(H2.substring(2, 5));
        System.out.println(H2.trim());
        String H3 = "15/02/2003";
        String[] H = H3.split("/",3);
        for(String i : H)
            System.out.println(i); 
    }
}