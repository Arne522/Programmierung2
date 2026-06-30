public class KartesischeKoordinatenAdapter extends Zylinder{
    public KartesischeKoordinatenAdapter(Kartesisch kartesisch) {
        super(
                Math.sqrt(kartesisch.getX()*kartesisch.getX()+kartesisch.getY()*kartesisch.getY()),
                Math.toDegrees(Math.atan(kartesisch.getY()/kartesisch.getX())));
    }
}
