import jdk.swing.interop.SwingInterOpUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws InterruptedException {
    Ascensor ascensor = new Ascensor(3);

    for (int i = 1; i <= 5; i++) {
        new Thread(new Pasajero(i, ascensor)).start();
    }

}
