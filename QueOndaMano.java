import java.net.URL;
import java.security.Principal;
import java.text.BreakIterator;
import java.util.Scanner;
/*
Rodrigo Mansilla 22611
Programacion Orientada a Objetos Seccion 40
Lab 3


*/
public class QueOndaMano {

    
    /** 
     * @param args
     */
    public static void main(String[] args){
        Scanner kyb = new Scanner(System.in);
        Controller redoscial = new Controller();

        String menu = "Que onda Mano! Bienvenido , que queres hacer hoy? \n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" +
        "\t1. Agregar Post \n"+
        "\t2. Dar likes \n"+
        "\t3. Comentar \n"+
        "\t4. Ver Posts \n"+
        "\t5. Ver Hashtags en tendencia \n" +
        "\t6. ver posts y sus fechas\n"+
        "\t7. Darle play a un post \n" +
        "\t8. Salir \n";
        int Likes;
        String  Autor,datetime, Hashtags, Comments ,Texto, Happy, Sad, Angry, Crying, XD, Tamaño, URL, Formato,SampleRate, BitRate,FrameRate;
        int opcion = 1;
        while (opcion >=1 && opcion <9){
            try{
                System.out.println(menu);
                System.out.println("Ingrese una opcion: ");
                opcion = kyb.nextInt();
                switch (opcion){
                    case 1:
                       try{
                            System.out.println("Ingresa tu usuario: ");
                            Autor = kyb.nextLine();
                            System.out.println("Ingrese el la fecha: ");
                            datetime = kyb.nextLine();
                            System.out.println("ingresa el hashtag");
                            Hashtags = kyb.nextLine();
                            System.out.println("¿Qué tipo de post queres publicar ?\n");
                            System.out.println("1: Texto, 2: Multimedia, 3: Emoticono\n");
                            int accion = kyb.nextInt();
                            kyb.nextLine();
                        
                           
                            switch(accion){
                                case 1:
                                    System.out.println("Ingresa el texto que quieres publicar");
                                    Texto = kyb.nextLine();
                                break;

                                case 2:

                                System.out.println("Ingresa el Tamaño del archivo en Kb");
                                Tamaño = kyb.nextLine();
    
                                String Multimedia= "Que tipo de archivo quieres publicar? \n-_-_-_-_-_-_-__-_-_-_-_-_-_-_-"+
                                "\t1.Imagen"+
                                "\t2.Audio"+
                                "\t3.Video\n";
                                int opt =1;
                                while( opt >= 1 && opt <4){
                                    System.out.println(Multimedia);
                                    System.out.println("Ingresa una opcion");
                                    opt = kyb.nextInt();
                                        switch(opt){
                                            case 1:
                                                System.out.println("Ingresa el formato de la imagen (ng,  GIF,  jpeg,  etc)");
                                                System.out.println("Ingresa la URL del archivo:");
                                                URL = kyb.nextLine();
                                            break;
                                            case 2:
                                            System.out.println("Ingresa la URL del archivo");
                                            URL = kyb.nextLine();
                        
                                            System.out.println("Ingresa el sample rate Khz");
                                            SampleRate = kyb.nextLine();
                                            System.out.println("Ingresa el BitrRate kbits ");
                                            BitRate = kyb.nextLine();
                                            break;
                                            case 3 :
                                            System.out.println("Ingresa la URL del archivo");
                                            URL = kyb.nextLine();
                                            System.out.println("Ingresa el FrameRate  en fps");
                                            FrameRate = kyb.nextLine();
                                            break;

                                          }
                                        }
                                case 3:
                                System.out.println("Ingresa una el emoji que quieres poner");
                            
                                String emojis= "Que tipo de archivo quieres publicar? \n-_-_-_-_-_-_-__-_-_-_-_-_-_-_-"+
                                "\t1.:)"+
                                "\t2. :("+
                                "\t3.>:("+
                                "\t4.:''("+
                                "\t5.XD";
                                int ch =1;
                                while( ch >= 1 && ch <6){
                                    System.out.println(emojis);
                                    System.out.println("Ingresa una opcion");
                                    opt = kyb.nextInt();
                                    switch(opt){
                                        case 1:
                                        System.out.println(":)");
                                    break;
                                        case 2:
                                          System.out.println(":(");
                                        break;
                                        case 3:
                                          System.out.println(">:(");
                                          break;
                                        case 4:
                                          System.out.println(":''(");
                                          break;
                                        case 5:
                                          System.out.println("XD");
                                          break;
                                    }
                                    

                                }
                            } 
                       } catch (Exception e) {
                        System.out.println("Verifique si ingreso bien la opcion");
                       }
                    break;

                    case 2:
                       System.out.println("Le has dado like");
                     break;

                    case 3 :
                       System.out.println("Ingresa tu comentario");
                        kyb.nextLine();
                    break;

                    case 4  :
                    System.out.println(redoscial.verPosts());
                    break;
                    case 5 :
                    System.out.println(redoscial.verHashtags());
                    break;
                    case 6 :
                    System.out.println(redoscial.verfecha());
                    break;
                    case 7 :
                    System.out.println("Que post quieres reproducir?");
                    System.out.println("1: Texto, 2: Audio, 3: Video , 4:Imagen, 5.Emoticono\n");
                    int act = kyb.nextInt();
                    kyb.nextLine();
                    switch(act){
                         case 1:
                            System.out.println(redoscial.PlayText());
                            break;

                            case 2:
                        System.out.println(redoscial.PlayAudio());
                            break;
                            case 3:
                        System.out.println(redoscial.PlayVideo());
                            break;

                            case 4:
                            System.out.println(redoscial.PlayIMG());
                            break;
                            case 5:
                            System.out.println(redoscial.PlayEmoticon());
                            break;
                    
                    }
                    break;
                    default:
                        System.out.println("Que Onda Mano! Gracias por visitarnos!");
                    break;
                }
            } catch (Exception e) {
                kyb.nextLine();
                System.out.println("\n ingrese un numero en la entrada");
                opcion = 1;

            }
        }

    }
}
                       

                  

                
                                
                            
                            
                    


                                

                            
                            
                            
                                 
              
        
        
                        
                    
                
            
