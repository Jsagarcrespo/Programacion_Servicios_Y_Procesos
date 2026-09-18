void main() throws IOException, InterruptedException {

  /* ProcessBuilder psaludo = new ProcessBuilder("java", "/c", "dire");

   psaludo.inheritIO();
   System.out.printf("programa principal");
   Process process = psaludo.start();

   process.waitFor();

   ProcessBuilder pnumeros = new ProcessBuilder("java", "src/numero.java");

*/

   System.out.println("Programa principal");

   // Ejecutar HolaMundo
   ProcessBuilder procesoHola = new ProcessBuilder("java", "src/HolaMundo.java");

   procesoHola.inheritIO();

   Process hola = procesoHola.start();

   hola.waitFor();


   // Ejecutar Numeros
   ProcessBuilder procesoNumeros = new ProcessBuilder("java", "src/numero");

   procesoNumeros.inheritIO();

   Process numeros = procesoNumeros.start();

   numeros.waitFor();


   //////////////////////////////// SI NO ME LLEGA A CARGAR EL EJERCICIO //////////////////////////////
   //////////////////////////////// PARA QUE SE ME CREE LA CARPETA OUT //////////////////////////////
   //   javac -d out src/HolaMundo.java src/numero.java src/ejer7.java

}
