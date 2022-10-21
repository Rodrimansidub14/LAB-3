
/*
Rodrigo Mansilla 22611
Programacion Orientada a Objetos Seccion 40
Lab 3


*/

import java.util.Date;

public class Emoticon extends POST{
private String Happy;
private String Sad;
private String Angry;
private String Crying;
private String XD;


public Emoticon(){
Autor = "Juan Molina";
datetime = new Date();

Hashtags = "#happytime";
Likes = 7;
Comments = "Que cool!";
Happy = ":)";
Sad = ":(";
Angry = ">:(";
Crying = ":''(";
XD = "XD";

}

public Emoticon(String Happy, String Sad, String Angry , String Crying, String XD, String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    this.Happy= Happy;
    this.Sad = Sad; 
    this.Angry = Angry;
    this.Crying = Crying;
    this.XD = XD;
    this.Autor = Autor;
    this.datetime = datetime;
    this.Hashtags = Hashtags;
    this.Likes = Likes;
    this.Comments = Comments;
}


    
    /** 
     * @return String
     */
    public String getHappy() {
        return this.Happy;
    }

    
    /** 
     * @param Happy
     */
    public void setHappy(String Happy) {
        this.Happy = Happy;
    }

    
    /** 
     * @return String
     */
    public String getSad() {
        return this.Sad;
    }

    
    /** 
     * @param Sad
     */
    public void setSad(String Sad) {
        this.Sad = Sad;
    }

    
    /** 
     * @return String
     */
    public String getAngry() {
        return this.Angry;
    }

    
    /** 
     * @param Angry
     */
    public void setAngry(String Angry) {
        this.Angry = Angry;
    }

    
    /** 
     * @return String
     */
    public String getCrying() {
        return this.Crying;
    }

    
    /** 
     * @param Crying
     */
    public void setCrying(String Crying) {
        this.Crying = Crying;
    }

    
    /** 
     * @return String
     */
    public String getXD() {
        return this.XD;
    }

    
    /** 
     * @param XD
     */
    public void setXD(String XD) {
        this.XD = XD;
    }


    
    /** 
     * @return String
     */
    public String Playpost(){
        return "no puedo reproducir esta expresión facial";
    }
}

