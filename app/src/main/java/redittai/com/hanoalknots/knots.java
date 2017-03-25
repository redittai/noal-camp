package redittai.com.hanoalknots;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

import java.net.URL;

/**
 * Created by USER on 21/12/2016.
 */

public class knots {
    private String Name;
    private String Url;
    private String Description;
    private Drawable img;
    private String shortDescription;

    public knots(String url, String description, String name) {
        Url = url;
        Description = description;
        Name = name;
    }

    public knots(String name, String url, String desc, String shortDescription){
        this.Name = name;
        this.Url = url;
        this.Description = desc;
        this.shortDescription = shortDescription;

    }
    public String getName(){
        return Name;
    }

    public String getUrl() {
        return Url;
    }

    public String getDescription() {
        return Description;
    }

    public knots(String name, String url, String description, String shortDescription,Drawable img) {
        Name = name;
        Url = url;
        Description = description;
        this.img = img;
        this.shortDescription = shortDescription;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public String toString() {
        return
                "Name='" + Name + '\'' +
                ", Url='" + Url + '\'' +
                ", Description='" + Description + '\'' +
                ", shortDescription='" + shortDescription ;
    }
}
