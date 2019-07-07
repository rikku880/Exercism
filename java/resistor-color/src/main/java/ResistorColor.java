import java.util.*;

class ResistorColor {
    String[] colorCodes;
    ResistorColor()
    {
        this.colorCodes=new String [] {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    }
    int colorCode(String color) {
        return Arrays.asList(colorCodes).indexOf(color);

    }

    String[] colors() {
        return  colorCodes;

    }
}
