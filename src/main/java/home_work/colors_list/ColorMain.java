package home_work.colors_list;

import java.util.ArrayList;
import java.util.List;

public class ColorMain {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("melyna");
        color.add("raudona");
        color.add("zalia");
        color.add("oranzine");


        System.out.println(color);
        System.out.println("******************************");
        for (String s : color) {
            System.out.println(s);

        }
        System.out.println("******************************");
        color.add(0,"geltona");
        System.out.println(color.get(0));
        System.out.println(color);
        System.out.println("******************************");

        List<String> colorDuplicate;
        colorDuplicate = color;
        System.out.println("Color duplicate of color: " + colorDuplicate);



    }
}
