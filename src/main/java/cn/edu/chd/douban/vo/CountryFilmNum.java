package cn.edu.chd.douban.vo;

public class CountryFilmNum {
    private String countryName;
    private Integer num;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "CountryFilmNum{" +
                "countryName='" + countryName + '\'' +
                ", num=" + num +
                '}';
    }
}
