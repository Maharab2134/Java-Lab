public class Library {
    private static String libraryName = "City Library";

    public static String getLibraryName() {
        return libraryName;
    }

    public static void main(String[] args) {
        System.out.println(Library.getLibraryName());
    }
}