/*
Rodrigo Mansilla 22611
Programacion Orientada a Objetos Seccion 40
Lab 3


*/

import java.util.Date;



public class Texto extends POST {
    private String Texto;

    public Texto() {
        Autor = "Juan Molina";
        datetime = new Date();
        ;
        Hashtags = "#happytime";
        Likes = 7;
        Comments = "Que cool!";
        Texto = "Un dia muy bueno";
    }

public Texto(String Texto , String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    this.Texto = Texto;
    this.Autor = Autor;
    this.datetime = datetime;
    this.Hashtags = Hashtags;
    this.Likes = Likes;
    this.Comments = Comments;

    }

    
    /** 
     * @return String
     */
    public String getTexto() {
        return this.Texto;
    }

    
    /** 
     * @param Texto
     */
    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    
    /** 
     * @return String
     */
    public String Playpost(){
        return "voy a pasarlo a voz Text to Speech ...";
    }



    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + 
            "\nTexto:" + getTexto() 
            ;
    }


}

