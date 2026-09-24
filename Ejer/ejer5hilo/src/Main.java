void main() throws InterruptedException {


    class Hio extends Thread{
        private int[] array;
        private int inicio, fin;
        private double resultado;

        public int getSuma() {
            return Suma;
        }

        public void setSuma(int suma) {
            Suma = suma;
        }

        private int Suma = 0;

        public Hio(int[] array, int inicio, int fin, double resultado) {
            this.array = array;
            this.inicio = inicio;
            this.fin = fin;
        }

        @Override
        public void run()    {
            for (int i = 0; i < fin; i++) {
                Suma = Suma + array[i];
            }

            System.out.println(Thread.currentThread().getName()+": " + Suma);
        }



    }



}
