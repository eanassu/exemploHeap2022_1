package exemploheap2022_1;

public class ExemploHeap2022_1 { 

    // obs: este algoritmo não usa a posição 0 do vetor. 
    // ele constroi o heap entre as posições 1 e n-1
    public static void construirHeap(int [] v) {
        for( int k = 1; k < v.length-1; k++ ) {
            int f = k+1;
            while( f > 1 && v[f/2] < v[f]) {
                int aux = v[f/2]; v[f/2]=v[f]; v[f]=aux;
                f = f/2;
            }
        }
    }

    public static void consertarHeap( int m, int v[] ) {
        int f=2;
        while( f <= m ) {
            if ( f < m && v[f] < v[f+1] ) f++;
            if ( v[f/2] >= v[f] ) break;
            int aux = v[f/2]; v[f/2] = v[f]; v[f] = aux;
            f = f*2;
        }
    }
    
    
    public static void main(String[] args) {
        int vetor[] = {-1, 5, 10, 3, 15, 7,9,1,8,13,4};
        construirHeap(vetor);
        
        for( int i = 1; i < vetor.length; i++ ) System.out.println(vetor[i]);
        System.out.println("depois de consertar");
        vetor[1] = vetor[vetor.length-1];
        consertarHeap(vetor.length-2, vetor);
        for( int i = 1; i < vetor.length-1; i++ ) System.out.println(vetor[i]);
    }
    
}
