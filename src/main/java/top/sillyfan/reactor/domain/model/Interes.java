package top.sillyfan.reactor.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 用户的兴趣
 */
@Document
public class Interes {

    @Id
    private String id;

    private String intere;

    private String music;

    private String movie;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntere() {
        return intere;
    }

    public void setIntere(String intere) {
        this.intere = intere;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
