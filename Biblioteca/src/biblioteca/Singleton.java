package biblioteca;
//podemos colocar essa classe abstrata para 
//quando necessario criar uma unica instancia.
//Quando a classe precisa ela extende.
// acho que podemos usar no facade crinado uma unica instacia de biblioteca
// basta implementar makeInstance na classe que chama.

public class Singleton {

   protected Singleton() {}
   private static Singleton soleInstance = null;
   public static Singleton Instance () {

      if (soleInstance == null)
          soleInstance = new Singleton ();
      return soleInstance ;

   }

}
