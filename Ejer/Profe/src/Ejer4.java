import javax.print.attribute.standard.PrinterMessageFromOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException, InterruptedException {

   Runtime consola= Runtime.getRuntime();
   String comando = "CMD /C DIR";
   Process p;

   p = consola.exec(comando);

   String salida = new String(p.getInputStream().readAllBytes());

   System.out.println(salida);

   p.waitFor();



   // PROCESBUILDER

   ProcessBuilder whoami = new ProcessBuilder("cmd.exe", "/c", "DIR");

   Process proceso = whoami.start();

   String salidaBuilder = new String(proceso.getInputStream().readAllBytes());

   proceso.waitFor();

   System.out.println(salidaBuilder);

}

