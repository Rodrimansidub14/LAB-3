/*
Rodrigo Mansilla 22611
Programacion Orientada a Objetos Seccion 40
Lab 3


*/


import java.util.Date;

public class Imagen extends Multimedia{
    private String Formato;

    public Imagen(){
        Formato= "7Mpx";
        Autor = "Juan Molina";
        datetime = new Date();
        ;
        Hashtags = "#happytime";
        Likes = 7;
        Comments = "Que cool!";
        Tamaño = "144KB";
        URL = "https://i.pinimg.com/564x/b6/2b/f4/b62bf4d6aa7019de819f80f01667e466.jpg";
    }

    public Imagen( String Formato, String Tamaño,String URL ,String Autor, Date datetime, String Hashtags, int Likes, String Comments){
        this.Formato = Formato;
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
    public String getFormato() {
        return this.Formato;
    }

    
    /** 
     * @param Formato
     */
    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    
    /** 
     * @return String
     */
    public String Playpost(){
        return "estoy mostrando esta imagen"+getURL() + "con" + getFormato() + "Megapíxeles de resolución";
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "Imagen"+
            "\nFormato:" + getFormato();
           
            
    }



}
