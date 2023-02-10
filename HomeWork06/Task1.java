import java.util.*;

public class Task1 {

public static Map<Integer, LapTop> shop = new HashMap<>();
    public static void main(String[] args) {
        //LapTop laptop = new LapTop();
//        laptop.NameCompany("Asus");
//        laptop.OperatingSystem("Windows");
//        laptop.VolumeHD("500Gb");
//        laptop.MemoryRAM("8Gb");
//        laptop.Color("Black");

        List<String> lapTopBase = Arrays.asList(
                "Asus Windows 500Gb 8Gb Black",
                "HP Windows 250Gb 6Gb Gray",
                "Lenovo Linux 1000Gb 8Gb White"
        );

        NewLaptop(lapTopBase);
        //printHashMap(NewLaptop(lapTopBase));
        System.out.println();


        Controller.main();

    }
    public static Map<Integer, LapTop> NewLaptop(List<String> lapTopBase){
        //Map<Integer, LapTop> shop = new HashMap<>();
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


    public static void printHashMap(Map<Integer, LapTop> names) {
        for (Map.Entry<Integer, LapTop> el : names.entrySet()) {
            System.out.print(el.getKey() + ": " + el.getValue().getInfo() + "\n");
        }
    }




}
