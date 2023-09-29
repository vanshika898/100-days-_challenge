class comparefuction {
    public static void main(String[] args) {
        String str = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        if (str == str2) {
            System.out.println("str and str2 are the same object");
        } else {
            System.out.println("str and str2 are different objects");
        }

        if (str == str3) {
            System.out.println("str and str3 are the same object");
        } else {
            System.out.println("str and str3 are different objects");
        }

        if (str.equals(str3)) {
            System.out.println("str and str3 have the same content");
        } else {
            System.out.println("str and str3 have different content");
        }
    }
}
