package projectEuler.utils;

public class Triplet<T, U, V>
{
   T a;
   U b;
   V c;

   public Triplet(T a, U b, V c)
   {
    this.a = a;
    this.b = b;
    this.c = c;
   }

   public T getA(){ return a;}
   public U getB(){ return b;}
   public V getC(){ return c;}
   public String toString(){
	   return "["+a.toString() + ", " + b.toString()+ ", " +c.toString() +"]";
   }
}