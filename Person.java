/**
 *
 * @author sahal asyari
 */
public class Person {
    private String name;
    private String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;        
    }

    void setName(String name){
        this.name = name;
    }

    void setAddress(String address){
        this.address = address;
    }

    String getName(){
        return name;
    }

    String getAddress(){
        return address;
    }

    public String toString(){
        return "Nama: " + getName() + "\n" + "Alamat: " + getAddress(); 
    }
}