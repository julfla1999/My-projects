public class LeapYear {
    public static void main(String[] args) {
        int myYear = 1235;

        if(myYear%4 != 0) {
            System.out.println("Ten rok nie jest przestępny.");
        } else if(myYear%4 == 0 && myYear%100 != 0) {
            System.out.println("Ten rok jest przestępny.");
        } else if(myYear%4 == 0 && myYear%100 == 0 && myYear%400 != 0) {
            System.out.println("Ten rok nie jest przestępny.");
        } else if(myYear%4 == 0 && myYear%100 == 0 && myYear%400 == 0) {
            System.out.println("Ten rok jest przestępny.");
        }
    }
}
