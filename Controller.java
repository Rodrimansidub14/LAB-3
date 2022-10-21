import java.util.ArrayList;
import java.util.Date;

/*
Rodrigo Mansilla 22611
Programacion Orientada a Objetos Seccion 40
Lab 3


*/
public class Controller {
private ArrayList<POST> Post;


public Controller(){
    Post =new ArrayList<POST>();
}


/** 
 * @param Texto
 * @param Autor
 * @param datetime
 * @param Hashtags
 * @param Likes
 * @param Comments
 */
public void addTEXTPOST(String Texto , String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    Post.add(new Texto());
}



/** 
 * @param Formato
 * @param Tamaño
 * @param URL
 * @param Autor
 * @param datetime
 * @param Hashtags
 * @param Likes
 * @param Comments
 */
public  void addImagen(String Formato, String Tamaño,String URL ,String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    Post.add(new Imagen(Formato , Tamaño, URL , Autor, datetime, Hashtags,Likes, Comments));

}


/** 
 * @param SampleRate
 * @param Bitrate
 * @param Tamaño
 * @param URL
 * @param Autor
 * @param datetime
 * @param Hashtags
 * @param Likes
 * @param Comments
 */
public void addAudio(String SampleRate,String Bitrate, String Tamaño,String URL ,String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    Post.add(new Audio(SampleRate, Bitrate, Tamaño, URL, Autor, datetime, Hashtags,Likes, Comments));
}



/** 
 * @param FrameRate
 * @param Tamaño
 * @param URL
 * @param Autor
 * @param datetime
 * @param Hashtags
 * @param Likes
 * @param Comments
 */
public void addVideo(String FrameRate, String Tamaño,String URL ,String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    Post.add(new Video(FrameRate, Tamaño, URL, Autor, datetime, Hashtags,Likes, Comments));
}


/** 
 * @param Happy
 * @param Sad
 * @param Angry
 * @param Crying
 * @param XD
 * @param Autor
 * @param datetime
 * @param Hashtags
 * @param Likes
 * @param Comments
 */
public void addEmoticon(String Happy, String Sad, String Angry , String Crying, String XD, String Autor, Date datetime, String Hashtags, int Likes, String Comments){
    Post.add(new Emoticon(Happy, Sad, Angry, Crying, XD, Autor, datetime, Hashtags, Likes, Comments));
}





/** 
 * @return String
 */
public String verPosts(){
    String result = "POSTS \n--------------------------------\n";
    for (POST post : Post){
        result = result+ post.toString() + "\n";
    }
    return result + "\n--------------------------------\n";
    
}


/** 
 * @return String
 */
public String verHashtags(){
        String result = "Hahtags \n--------------------------------\n";
        for (POST post : Post){
            result = result+ post.getHashtags() + "\n";
        }
        return result + "\n--------------------------------\n";

}


/** 
 * @return String
 */
public String verfecha(){
    String result = "Post por fecha \n--------------------------------\n";
    for (POST post : Post){
        result = result+ post.getDatetime() + "\n";
    }
    return result + "\n--------------------------------\n";

}

    
    /** 
     * @return String
     */
    public String PlayText(){
        String result = "REPRODUCIENDO:\n---0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0---\n";
        for (POST post : Post){
            if (post instanceof Texto)
             result = result+ post.Playpost() + "\n";
        }
        return result + "\n---0-0-0-0-0-0-0\n";
    }
    
    /** 
     * @return String
     */
    public String PlayVideo(){
        String result = "REPRODUCIENDO:\n---0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0---\n";
        for (POST post : Post){
            if (post instanceof Video)
             result = result+ post.Playpost() + "\n";
        }
        return result + "\n---0-0-0-0-0-0-0\n";
    }

    
    /** 
     * @return String
     */
    public String PlayIMG(){
        String result = "REPRODUCIENDO:\n---0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0---\n";
        for (POST post : Post){
            if (post instanceof Imagen)
             result = result+ post.Playpost() + "\n";
        }
        return result + "\n---0-0-0-0-0-0-0\n";
    }

    
    /** 
     * @return String
     */
    public String PlayAudio(){
        String result = "REPRODUCIENDO:\n---0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0---\n";
        for (POST post : Post){
            if (post instanceof Audio)
             result = result+ post.Playpost() + "\n";
        }
        return result + "\n---0-0-0-0-0-0-0\n";
    }
    
    /** 
     * @return String
     */
    public String PlayEmoticon(){
        String result = "REPRODUCIENDO:\n---0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0---\n";
        for (POST post : Post){
            if (post instanceof Emoticon)
             result = result+ post.Playpost() + "\n";
        }
        return result + "\n---0-0-0-0-0-0-0\n";
    }


    }


    





