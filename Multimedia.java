import java.util.Date;

public class Multimedia extends POST {
    protected String Tamaño;
    protected String URL;
    

    public  Multimedia(){
        Autor = "Juan Molina";
        datetime = new Date();
        ;
        Hashtags = "#happytime";
        Likes = 7;
        Comments = "Que cool!";
        Tamaño = "144KB";
        URL = "https://i.pinimg.com/564x/b6/2b/f4/b62bf4d6aa7019de819f80f01667e466.jpg";
    }

    public Multimedia( String Tamaño,String URL ,String Autor, Date datetime, String Hashtags, int Likes, String Comments){
        this.Tamaño = Tamaño;
        this.URL = URL;
        this.Autor = Autor;
        this.datetime = datetime;
        this.Hashtags = Hashtags;
        this.Likes = Likes;
        this.Comments = Comments;

    }



    
    /** 
     * @return String
     */
    public String getTamaño() {
        return this.Tamaño;
    }

    
    /** 
     * @param Tamaño
     */
    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    
    /** 
     * @return String
     */
    public String getURL() {
        return this.URL;
    }

    
    /** 
     * @param URL
     */
    public void setURL(String URL) {
        this.URL = URL;
    }
    
    
    /** 
     * @return String
     */
    public String Playpost(){
        return "Estoy mostrando un archivo multimedia";
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "Multimedia"+
            "\nTamaño:" + getTamaño()+
            "\nURL:" + getURL(); 
            
    }
    }



