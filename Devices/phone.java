public class phone extends Device {
    private int phoneBattery;
    public phone(int battery) {
        super(battery);
            phoneBattery=battery;
    }
    public void playagame(){
        
      
        if(phoneBattery<=100 && phoneBattery>25 ){
            System.out.println("Playing a game");
            phoneBattery=phoneBattery-20;
            System.out.println("Battery remaining: "+phoneBattery);
            if (phoneBattery<10) {
                System.out.println("Battery is critical");
                
            }
        }
        else{
            System.out.println("Battery is low, cannot play a game");
        }
        
    }

    public void makeacall(){
        System.out.println("Making call");
        if(phoneBattery<=100 && phoneBattery>0  ){
            phoneBattery=phoneBattery-5;
            System.out.println("Battery remaining: "+phoneBattery);
            if (phoneBattery<10) {
             System.out.println("Battery is critical");
            
            }
        }
        
    }
    public void charge(){
        System.out.println("Charging");
        if(phoneBattery<=100 && phoneBattery>0 ){
            if (!((phoneBattery+50)>100)) {
                phoneBattery=phoneBattery+50;
            }
            else{
                phoneBattery=100;
            }
        
        System.out.println("Battery remaining: "+phoneBattery);
        }
    }
}
