void main() throws IOException, InterruptedException {

   ProcessBuilder temp = new ProcessBuilder("cmd.exe", "/c", "dire");

   Process process = temp.start();

   String errores = new String(process.getErrorStream().readAllBytes());

   FileWriter fichero = new FileWriter(
           "C:\\Users\\149FA04\\Desktop\\PSP\\Profe\\errores.txt"
   );

   fichero.write(errores);
   fichero.close();





}
