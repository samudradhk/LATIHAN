public class Shelter {
    private String place;
    private String desc;

    public Shelter(String place,String desc){
        this.place = place;
        this.desc = desc;
    }

    String getPlace(){
        return place;
    }

    String getDesc(){
        return desc;
    }
}
