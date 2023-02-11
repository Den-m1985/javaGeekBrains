public class LapTop {

    private String nameCompany;
    private String memoryRAM;
    private String volumeHD;
    private String operatingSystem;
    private String color;


    // Конструктор по умолчанию.
    public LapTop() {
        this.nameCompany = "defolt";
        this.memoryRAM = "defolt";
        this.volumeHD = "defolt";
        this.operatingSystem = "defolt";
        this.color = "defolt";
    }


    /** Получение информации */
    public String getInfo() {
        return String.format("Name: %s,  RAM: %s, HD: %s, OS: %s, Color: %s" ,
                this.nameCompany, this.memoryRAM, this.volumeHD, this.operatingSystem, this.color);
    }


    /** Бренд компании */
    public String NameCompany (String nameCompany){
        return this.nameCompany = nameCompany;
    }


    /** Объем оперативной памяти */
    public String MemoryRAM (String memoryRAM){
        return this.memoryRAM = memoryRAM;
    }


    /** Объем жесткого диска */
    public String VolumeHD (String volumeHD){
        return this.volumeHD = volumeHD;
    }


    /** Операционная система */
    public String OperatingSystem (String operatingSystem){
        return this.operatingSystem = operatingSystem;
    }


    /** Цвет корпуса */
    public String Color (String color){
        return this.color = color;
    }

    /** Возврат объема RAM */
    public String GetMemoryRAM (){
        return this.memoryRAM;
    }

    /** Возврат объема HD */
    public String GetVolumeHD (){
        return this.volumeHD;
    }

    /** Возврат имени ОС */
    public String GetOS (){
        return this.operatingSystem;
    }

    /** Возврат цвета */
    public String GetColor (){
        return this.color;
    }

    /** Возврат бренда */
    public String GetNameCompany (){
        return this.nameCompany;
    }




}
