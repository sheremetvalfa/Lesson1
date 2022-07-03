public class Nokia extends Phone implements PhoneConnection {
    public Nokia(String name){
        this.name = name;
    }
    public void call(){
        System.out.println("I'm calling from "+name );
    }
    public void sendSMS(){
        System.out.println("I'm send message from "+name);
    }

}
