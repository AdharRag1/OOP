import java.util.ArrayList;

public class Order {

    private String name;
    private ArrayList<String> items = new ArrayList<String>();
    
    private boolean ready;

    public Order (){
        this.name = "Guests";
        ArrayList<String> items = new ArrayList<String>();

    }
    public Order (String name,ArrayList<String> Items){
        this.name = name;
        ArrayList<String> items = new ArrayList<String>();

    }
    public void setName(String name) {
        this.name= name;
    }
    public String getName() {
        return name;
    }
    
    public void setArray(ArrayList<String> Items) {
        this.items= items;
    }
    public String getArray() {
        return items;
    }

    public void setbool(boolean ready) {
        this.ready= ready;
    }
    public String getbool() {
        return ready;
    }


}
