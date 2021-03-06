package uttrykk

/**
 * Created by jorn ola birkeland on 07.04.15.
 */
class BelopDiffUttrykk(ledd1: BelopUttrykk, ledd2: BelopUttrykk) extends BelopUttrykk{
  override def eval(uc: UttrykkContext): Belop = {
    uc.eval(ledd1) - uc.eval(ledd2);
  }

  override def beskriv(uc: UttrykkContext): String = {
    uc.beskriv(ledd1)+" - "+uc.beskriv(ledd2)
  }
}
