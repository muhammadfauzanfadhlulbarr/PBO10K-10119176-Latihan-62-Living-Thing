/**
 * Latihan62
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Living Thing
 */
public abstract class LivingThing {

    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama + " Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " Makan");
    }
}