public class Samsung extends Phone implements PhoneConnection,PhoneMedia {
    int ram;
    double memory;
    public Samsung(String name,int ram,double memory,String model){
        this.name = name;
        this.ram = ram;
        this.memory = memory;
        this.model = model;
    }
    public void makePhoto(){
        System.out.println(name+", "+model+" can make a photo, because he has a "+ memory+ " GIG memory" );
    }
    public void recordVideo() {
        System.out.println(name+", "+model+" can record a video, because he has a "+ memory+ " GIG memory and "+ram +" GIG RAM");
    }
    public void call(){
        System.out.println("I'm calling from "+name );
    }
    public void sendSMS(){
        System.out.println("I'm send message from "+name );
    }
}
