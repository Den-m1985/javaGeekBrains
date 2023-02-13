import java.util.*;

public class Task1 {

public static Map<Integer, LapTop> shop = new HashMap<>();

public static List<String> lapTopBase = Arrays.asList(
        "Asus Windows 500Gb 8Gb Black",
        "HP Windows 250Gb 6Gb Gray",
        "Lenovo Linux 1000Gb 8Gb White"
);
    public static void main(String[] args) {

        NewLaptop(lapTopBase);
        System.out.println();

        Controller.main();

    }
    public static Map<Integer, LapTop> NewLaptop(List<String> lapTopBase){

        for (int i = 0; i < lapTopBase.size(); i++) {
            String[] tempText = lapTopBase.get(i).split(" ");
            LapTop laptop = new LapTop();
            for (int j = 0; j < tempText.length; j++) {
                laptop.NameCompany(tempText[0]);
                laptop.OperatingSystem(tempText[1]);
                laptop.VolumeHD(tempText[2]);
                laptop.MemoryRAM(tempText[3]);
                laptop.Color(tempText[4]);
            }
            shop.put(i, laptop);
            //System.out.println(laptop.getInfo());
        }
        return shop;
    }

}
