public class Main {
    public static void main (String[] args){
        Samsung samsung = new Samsung("Samsung",8,120000,"Galaxy s8");
        samsung.sendSMS();
        samsung.call();
        samsung.makePhoto();
        samsung.recordVideo();
        System.out.println();
        Nokia nokia = new Nokia("Nokia");
        nokia.sendSMS();
        nokia.call();

    }
}