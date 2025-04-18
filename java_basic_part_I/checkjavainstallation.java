public class checkjavainstallation{
    public static void main(String[] args) {
     System.out.println(System.getProperty("java.version"));
     System.out.println(System.getProperty("java.home"));
     System.out.println(System.getProperty("java.vendor"));
     System.out.println(System.getProperty("java.vendor.url"));
     System.out.println(System.getProperty("java.class.version"));
     System.out.println(System.getProperty("java.class.path"));
     System.out.println(System.getProperty("java.library.path"));
     System.out.println(System.getProperty("java.io.tmpdir"));
     System.out.println(System.getProperty("java.compiler"));
    }
}