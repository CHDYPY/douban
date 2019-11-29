package cn.edu.chd.douban.vo;

public class Item {
    private Object itemName;
    private Integer num;
    private Double heat;
    private Double score;

    public Object getItemName() {
        return itemName;
    }

    public void setItemName(Object itemName) {
        this.itemName = itemName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getHeat() {
        return heat;
    }

    public void setHeat(Double heat) {
        this.heat = heat;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Item{" +
                "countryName='" + itemName + '\'' +
                ", num=" + num +
                ", heat=" + heat +
                ", score=" + score +
                '}';
    }
}
