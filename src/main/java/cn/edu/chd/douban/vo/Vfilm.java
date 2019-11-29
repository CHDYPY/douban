package cn.edu.chd.douban.vo;

import cn.edu.chd.douban.bean.Film;


public class Vfilm extends Film {
    private String director;
    private String writer;
    private String actor;
    private Integer years;
    private String way;


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    @Override
    public String toString() {
        return "Vfilm{" +
                super.toString() +
                "director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", actor='" + actor + '\'' +
                ", years='" + years + '\'' +
                ", way='" + way + '\'' +
                '}';
    }
}
