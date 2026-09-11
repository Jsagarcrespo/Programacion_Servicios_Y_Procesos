void main() throws IOException, InterruptedException {

   ProcessBuilder temp = new ProcessBuilder("cmd.exe", "/c", "dir");

   Process process = temp.start();

   String salida = new String(
           process.getInputStream().readAllBytes()
   );

   process.waitFor();

   FileWriter fichero = new FileWriter(
           "C:\\Users\\149FA04\\Desktop\\PSP\\Profe\\f1.txt"
   );

   fichero.write(salida);
   fichero.close();
}
