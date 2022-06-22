// class bfur{
    public static void main(String arg[]){
        StringBuffer s = new StringBuffer("HENIL");
        StringBuffer p = new StringBuffer("");
        StringBuffer v = new StringBuffer("Vinohai");
        String h =" Prajapati";
        String p1 ="";
        s.append(h);
        System.out.println(s);
        
        System.out.println( p.capacity());

        System.out.println(v);
        v.reverse();
        System.out.println(v);

        System.out.println(v);
        v.replace(3,4,"odb");
        System.out.println(v);

        System.out.println(v);
        
        System.out.println(v.lastIndexOf("i"));
        System.out.println(v.indexOf("i"));
        System.out.println(v.isEmpty());
        System.out.println(v.delete(5, 8));
        System.out.println(v.deleteCharAt(5));
        System.out.println(h);
        System.out.println(h.startsWith(" P"));
        System.out.println(h.endsWith("."));
        System.out.println(p1.isBlank());
        System.out.println(h.matches(" Prajapati"));
        System.out.println(h.repeat(3));
        System.out.println(h.trim());
        // System.out.println(h.getBytes());
        System.out.println(h.substring(5));
        System.out.println(h);
    }
}