public class Member {
    private String nama,team,umur;
    private double penampilan,suara,attitude,nilai;
    //muttator atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //muttator atribut team
    public void setTeam(String team) {
        this.team = team;
    }
    //muttator atribut umur
    public void setUmur(String umur) {
        this.umur = umur;
    }
    //muttator atribut Penampilan
    public void setPenampilan(double penampilan) {
        this.penampilan = penampilan;
    }
    //muttator atribut suara
    public void setSuara(double suara) {
        this.suara = suara;
    }
    //muttator atribut attitude
    public void setAttitude(double attitude) {
        this.attitude = attitude;
    }
    //accessor atribut nama
    public String getNama() {
        return nama;
    }
    //accessor atribut team
    public String getTeam() {
        return team;
    }
    //accessor atribut umur
    public String getUmur() {
        return umur;
    }
    //accessor atribut nilai rata rata
    public double getNilai() {
        return (penampilan+suara+attitude)/3;
    }
    
    
    
    
}
