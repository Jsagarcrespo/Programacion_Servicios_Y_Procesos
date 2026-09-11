import java.io.File;
import java.io.IOException;

void main() throws IOException, InterruptedException {

   ProcessBuilder processBuilder =
           new ProcessBuilder("cmd.exe", "/c", "dir");

   File carpeta = new File(System.getProperty("java.io.tmpdir"));

   processBuilder.directory(carpeta);

   System.out.println("Directorio de trabajo: "
           + processBuilder.directory());

   Process process = processBuilder.start();

   String salida = new String(
           process.getInputStream().readAllBytes()
   );

   process.waitFor();

   System.out.println(salida);
}
