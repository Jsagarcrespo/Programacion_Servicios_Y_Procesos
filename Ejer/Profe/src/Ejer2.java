import javax.print.attribute.standard.PrinterMessageFromOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException, InterruptedException {

    ProcessBuilder whoami = new ProcessBuilder("whoami.exe");
    // ESTOS  COMANDOS ESTAN EN SYSTEM332 SIN LA NECESIDAD DE LA LINEA DE COMANDOS

    whoami.inheritIO();

    Process proceso = whoami.start();











}

