public class Gorilla extends Mammal {
    
    
    
    public void throwSomething(){
        if (getEnergy()>=5) {
            setEnergy(getEnergy()-5);
        }
     
    }
    public void eatBananas(){
        if ((getEnergy()+10)>100) {
            setEnergy(100);
            
        }else{
            setEnergy(getEnergy()+10);
        }
        

    }
    public void climb(){
        if (getEnergy()>=10) {
            setEnergy(getEnergy()-10);
        }

    }
    
}
