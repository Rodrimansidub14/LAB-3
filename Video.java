/*
Rodrigo Mansilla 22611
Programacion Orientada a Objetos Seccion 40
Lab 3


*/

import java.util.Date;

public class Video extends Multimedia {
private String FrameRate;



public Video(){
    FrameRate = "60fps";
    Autor = "Juan Molina";
    datetime = new Date();
    Hashtags = "#happytime";
    Likes = 7;
    Comments = "Que cool!";
    Tamaño = "144KB";
    URL = "https://i.pinimg.com/564x/b6/2b/f4/b62bf4d6aa7019de819f80f01667e466.jpg";
}
public Video(String FrameRate, String Tamaño,String URL ,String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    this.FrameRate = FrameRate;
    this.Tamaño = Tamaño;
    this.URL = URL;
    this.Autor = Autor;
    this.datetime = datetime;
    this.Hashtags = Hashtags;
    this.Comments = Comments;
    this.Likes = Likes;
    
}

    
    /** 
     * @return String
     */
    public String getFrameRate() {
        return this.FrameRate;
    }

    
    /** 
     * @param FrameRate
     */
    public void setFrameRate(String FrameRate) {
        this.FrameRate = FrameRate;
    }

    
    /** 
     * @return String
     */
    public String Playpost(){
        return "voy a MOSTRAR este video" +getURL() + "con" +getComments( )+ "fps";
    }

    
    /** 
     * @return String
     */
    public String toString() {
        return super.toString() + "Video"+
            "\nFrameRate:" + getFrameRate();
           
            
    }

}
