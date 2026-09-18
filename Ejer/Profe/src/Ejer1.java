import javax.print.attribute.standard.PrinterMessageFromOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException, InterruptedException {

    ProcessBuilder note = new ProcessBuilder("notepad.exe", "notes.txt");
   // note.inheritIO();

    /*Process procesoNote = note.start();
    System.out.println(procesoNote.pid());
    System.out.println(procesoNote.isAlive());
    System.out.println(procesoNote.info());
    procesoNote.waitFor();*/


    // PROFE
    note.environment();
    Map<String,String> env=note.environment();
    System.out.println("num Proces " + env.get("NUMBER_OF_PROCESSORS"));
    System.out.println("Num procesadores "+ env.get("USERNAME"));

    Process proceso = note.start();
    System.out.println("aplicacion inciado correctamente");
    System.out.println("Pib:" + proceso.pid());

    Thread.sleep(6000);
    proceso.destroyForcibly();






}

