package co.com.sofka.covidtracking.model;




public class DateModel {

    private String dayinit;
    private String monthinit;
    private String yearinit;




    public String getDayinit() {
        return dayinit;
    }

    public void setDayinit(String dayinit) {
        this.dayinit = dayinit;
    }

    public String getMonthinit() {
        return monthinit;
    }

    public void setMonthinit(String monthinit) {
        this.monthinit = monthinit;
    }

    public String getYearinit() {
        return yearinit;
    }

    public void setYearinit(String yearinit) {
        this.yearinit = yearinit;
    }


    public String toString(){
        String data = ("/"+getYearinit()+"-"+getMonthinit()+
                "-"+getDayinit()+".json");
        return  data;
    }




}



