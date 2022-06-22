class StringBuf{
    public static void main(String[] args) {
        StringBuffer H= new StringBuffer("Henil ");
        System.out.println(H.append("Prajapati"));
        System.out.println(H.insert(5,"-"));
        System.out.println(H.delete(5,16));
        System.out.println(H.replace(5,6, "/"));
        System.out.println(H.capacity());
    }
}