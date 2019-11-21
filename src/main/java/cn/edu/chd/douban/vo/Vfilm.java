package cn.edu.chd.douban.vo;

import cn.edu.chd.douban.bean.Film;


public class Vfilm extends Film {
    private String director;
    private String writer;
    private String actor;
    private int years;


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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Vfilm{" +
                super.toString() +
                "director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", actor='" + actor + '\'' +
                ", years='" + years + '\'' +
                '}';
    }
}
