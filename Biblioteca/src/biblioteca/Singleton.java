//podemos colocar essa classe abstrata para 
//quando necessario criar uma unica instancia.
//Quando a classe precisa ela extende.
// acho que podemos usar no facade crinado uma unica instacia de biblioteca
// basta implementar makeInstance na classe que chama.

abstract public class Singleton {

   protected Singleton() {}
   abstract protected Singleton makeInstance();
   private static Singleton soleInstance = null;
   public static Singleton Instance () {

      if (soleInstance = null)
          soleInstance = makeInstance();
      return soleInstance ;

   }

}
