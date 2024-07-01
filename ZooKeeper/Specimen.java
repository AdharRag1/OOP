public class Specimen extends Mammal {
        private int energy;
        public Specimen(){
            energy = 300;
        }
        public int getEnergy() {
            return energy;
        }
        public void setEnergy(int energy){
            this.energy= energy;
        }
        public void displayEnergy(){
            System.out.println("Specimen energy= "+getEnergy());
        }
        public void fly(){
            setEnergy(energy-50);
            System.out.println("The bat is airborne");
        }
        public void eatHumans(){
            setEnergy(energy+20);
            System.out.println("Satisfied!");

        }
        public void attackTown(){
            setEnergy(energy-100);
            System.out.println("Attack Done ");
        }
    }