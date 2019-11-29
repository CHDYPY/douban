package cn.edu.chd.douban.bean;

import java.util.Date;

public class Film {
    private Long filmId;
    private String title;
    private Date year;
    private String types;
    private String region;
    private String releaseDate;
    private Integer size;
    private Float star;
    private String starPercent;
    private Long commentNum;
    private String src;
    private String description;
    private String language;
    private String otherName;

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", types='" + types + '\'' +
                ", region='" + region + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", size=" + size +
                ", star=" + star +
                ", starPercent='" + starPercent + '\'' +
                ", commentNum=" + commentNum +
                ", src='" + src + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", otherName='" + otherName + '\'' +
                '}';
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Float getStar() {
        return star;
    }

    public void setStar(Float star) {
        this.star = star;
    }

    public String getStarPercent() {
        return starPercent;
    }

    public void setStarPercent(String starPercent) {
        this.starPercent = starPercent;
    }

    public Long getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Long commentNum) {
        this.commentNum = commentNum;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }
}
