package printing;

/**
 * Created by UsmaanJ on 01/10/2016.
 */
public class Printer {
    public boolean isOn;
    public String modelNumber;

    public void print() {
        System.out.println(modelNumber);
    }

    public void print (String text) {
        System.out.println(text);
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public boolean power() {

        if(this.isOn) {
            this.isOn = false;
        } else {
            this.isOn = true;
        }

        System.out.println(this.isOn);
        return this.isOn;
    }

}
