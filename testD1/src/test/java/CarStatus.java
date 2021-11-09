public class CarStatus {

    private String doing;


    public void regNr() {
        doing = "RegNr";
    }
    public void color() {
        doing = "Color";
    }


    public String getDoing() {
        return doing;
    }
    public void setDoing(String doing) {
        this.doing = doing;
    }
}