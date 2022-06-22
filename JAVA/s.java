class s {
    public static void main(String[] args) {
        String s1 = "Henil ";
        String s3 = new String("   j Henil  ");
        System.out.println(s1 + "\n " + s3);
        String s = String.join(":", s3,s3,s1);
        System.out.println(s);
    }
}