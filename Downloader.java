import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Downloader
 */
public class Downloader {

    public static void main(String[] args) {
        try { 
            read("temp.list");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }    
    static void descargar( String url){

        System.out.println("Descargando: " + url);
        ProcessBuilder pb = new ProcessBuilder("pwd ; date;");
        pb.inheritIO();
        try {
            pb.start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void read( String location) throws IOException {

        List<String> content = Files.readAllLines(Paths.get(location));
        content.forEach(url -> descargar(url));
    }

}
