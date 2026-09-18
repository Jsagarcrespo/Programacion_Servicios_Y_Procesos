//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

  /*  for (int i = 0; i < ; i++) {

    }*/

    Hiloletra hl = new Hiloletra();
    Hiloletra hl1 = new Hiloletra();

    Hilonumero hn = new Hilonumero();

    hl.start();
    hl1.start();
    hn.start();

    hl1.getName(); 

    saludo s = new saludo();
    Thread hilosaludo = new Thread(s);
    hilosaludo.start();

//    s.run();   // Seria un fallo llamar a esto  y no hacer lo de arriba

}
