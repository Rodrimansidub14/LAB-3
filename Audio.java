/*
Rodrigo Mansilla 22611
Programacion Orientada a Objetos Seccion 40
Lab 3


*/
import java.util.Date;

public class Audio extends Multimedia  {
    private String SampleRate;
    private String BitRate;

public Audio(){
    SampleRate = "144kHz";
    BitRate = "16kbits";
    Autor = "Juan Molina";
    datetime = new Date();
    
    Hashtags = "#happytime";
    Likes = 7;
    Comments = "Que cool!";
    Tamaño = "144KB";
    URL = "https://i.pinimg.com/564x/b6/2b/f4/b62bf4d6aa7019de819f80f01667e466.jpg";
}




public Audio(String SampleRate,String Bitrate, String Tamaño,String URL ,String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    this.SampleRate = SampleRate;
    this.BitRate = Bitrate;
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
    public String getSampleRate() {
        return this.SampleRate;
    }

    
    /** 
     * @param SampleRate
     */
    public void setSampleRate(String SampleRate) {
        this.SampleRate = SampleRate;
    }

    
    /** 
     * @return String
     */
    public String getBitRate() {
        return this.BitRate;
    }

    
    /** 
     * @param BitRate
     */
    public void setBitRate(String BitRate) {
        this.BitRate = BitRate;
    }


    
    /** 
     * @return String
     */
    public String Playpost(){
        return "voy a SONAR este audio "+getURL() + " con" + getSampleRate() +"kHz de sample rate ";
    }


    
    /** 
     * @return String
     */
    public String toString() {
        return super.toString() + "Audio"+
            "\nSampleRate:" + getSampleRate()+
            "\nBitRate:" + getBitRate(); 
            
    }

}
