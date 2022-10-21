/*
Rodrigo Mansilla 22611
Programacion Orientada a Objetos Seccion 40
Lab 3


*/


import java.util.Date;

public abstract class POST {
    protected String Autor;
    protected Date datetime;
    protected String Hashtags;
    protected int Likes;
    protected String Comments;



    public abstract String Playpost();


    
    /** 
     * @return String
     */
    public String getAutor() {
        return this.Autor;
    }

    
    /** 
     * @param Autor
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    
    /** 
     * @return Date
     */
    public Date getDatetime() {
        return this.datetime;
    }

    
    /** 
     * @param datetime
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    
    /** 
     * @return String
     */
    public String getHashtags() {
        return this.Hashtags;
    }

    
    /** 
     * @param Hashtags
     */
    public void setHashtags(String Hashtags) {
        this.Hashtags = Hashtags;
    }

    
    /** 
     * @return int
     */
    public int getLikes() {
        return this.Likes;
    }

    
    /** 
     * @param Likes
     */
    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    
    /** 
     * @return String
     */
    public String getComments() {
        return this.Comments;
    }

    
    /** 
     * @param Comments
     */
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "\n" +
            " Autor: " + getAutor() + 
            " \ndatetime:" + getDatetime() + 
            " \nHashtags:" + getHashtags() + 
            " \nLikes:" + getLikes() + 
            " \nComments:" + getComments() + 
            " \nPlay:"+ Playpost();

    
    }

}
