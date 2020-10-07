import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pokemon
{
        private int punktyZycia;
        public String imie;
        private int poziom;
        private List<Object> Atak = new ArrayList<>();

        private void ustawHP(int lvl)
        {
            punktyZycia=(int)(lvl*1.4);
        }
        public Pokemon(String imie, int lvl)
        {
            Random random = new Random();
            ustawHP(lvl);
            this.imie=imie;
            poziom = random.nextInt(95)+5;
            ustawAtaki();
        }
        public void atakuj()
        {

        }
        public void odbierzAtak()
        {

        }
        private void ustawAtaki()
        {
            for(int i=0; i<5; i++) {
                Random random = new Random();
                Atak.add(random.nextInt(8)+3);
            }
        }
}
