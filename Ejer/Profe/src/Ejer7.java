void main() throws IOException, InterruptedException {

   ProcessBuilder psaludo = new ProcessBuilder("java", "/c", "dire");

   psaludo.inheritIO();
   System.out.printf("programa principal");
   Process process = psaludo.start();

   process.waitFor(); 
   String errores = new String(process.getErrorStream().readAllBytes());

   FileWriter fichero = new FileWriter(
           "C:\\Users\\149FA04\\Desktop\\PSP\\Profe\\errores.txt"
   );

   fichero.write(errores);
   fichero.close();

}
