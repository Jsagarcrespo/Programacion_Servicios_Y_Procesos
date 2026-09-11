import javax.print.attribute.standard.PrinterMessageFromOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException, InterruptedException {

    ProcessBuilder whoami = new ProcessBuilder("cmd.exe", "/c", "whoami");
    ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "whoami");


    Process proceso = whoami.start();

    String salida = new String(proceso.getInputStream().readAllBytes());

    proceso.waitFor();

    System.out.println(salida);

    // PROFE

    Process process = null;
     try {
         pb.inheritIO();
         pb.start();
         System.out.println(proceso.exitValue());
     }catch (IOException e){
         throw new RuntimeException(e);
     }

     proceso.waitFor();


}

