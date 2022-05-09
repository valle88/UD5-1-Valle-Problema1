public class Cola {
    private static final int MIN_CAPACITY= 10;

    public float numero [ ] = null;
    public   int objet = 0;



    public Cola() {
        numero = new float[MIN_CAPACITY];
    }
    public Cola(int initialCapacity) {
        numero= new float[initialCapacity];

    }



    public  void enqueque( int element, int position){
        if (objet == numero.length){
            float[ ] aux = numero;
            numero = new float[numero.length*2];
            for (int i = 0; i < objet; i++) {
                numero[i] = aux[i];
            }
            aux = null;
        }
        for (int j = objet -1; j >= position ; j--) {
            numero[j + 1]= numero[j];
        }
        numero[position]= element;
        objet++;
    }

    public void add(int element){
        enqueque(element, objet);
    }



    public  void dequeque(int position){
        float aux = numero[position];
        for (int i = position; i <objet -1 ; i++) {
            numero[i] = numero[i + 1];
        }

    }
    public float getEelement(int position){
        return (float) numero [position];
    }
    public  int getNumObject(){
        return objet;
    }


}
