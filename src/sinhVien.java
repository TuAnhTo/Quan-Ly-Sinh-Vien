public class sinhVien {
    private int ID;
    private String name;
    private String sex;
    private int toan;
    private  int ly;
    private  int hoa;

    public sinhVien (){

    }

    public sinhVien (int id, String name, String sex, int toan, int ly, int hoa) {
        ID = id;
        this.name = name;
        this.sex = sex;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public int getID () {
        return ID;
    }

    public void setID (int ID) {
        this.ID = ID;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSex () {
        return sex;
    }

    public void setSex (String sex) {
        this.sex = sex;
    }

    public int getToan () {
        return toan;
    }

    public void setToan (int toan) {
        this.toan = toan;
    }

    public int getLy () {
        return ly;
    }

    public void setLy (int ly) {
        this.ly = ly;
    }

    public int getHoa () {
        return hoa;
    }

    public void setHoa (int hoa) {
        this.hoa = hoa;
    }

    public int tongdiem(){
        return this.getToan() + this.getLy() + this.getHoa();
    }

    public void display(){
        System.out.println("ID: " + this.ID);
        System.out.println("ten: " +this.name);
        System.out.println("Gioi tinh: " + this.sex);
        System.out.println("Toan: " +this.toan);
        System.out.println(" Ly: " +this.ly);
        System.out.println("Hoa: " +this.hoa);
    }


}
