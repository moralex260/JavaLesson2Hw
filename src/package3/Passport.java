package package3;

public class Passport {
   private String series;
   private int Number;
   private String issuedBy;

    public Passport(String series, int number, String issuedBy) {
        this.series = series;
        Number = number;
        this.issuedBy = issuedBy;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                ", Number=" + Number +
                ", issuedBy='" + issuedBy + '\'' +
                '}';
    }
}
