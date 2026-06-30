public class ZylinderKooridinatenAdapter extends Kartesisch{

    public ZylinderKooridinatenAdapter(Zylinder zylinder) {
        super(
                zylinder.getR() * Math.cos(Math.toRadians(zylinder.getWinkel())),
                zylinder.getR() * Math.sin(Math.toRadians(zylinder.getWinkel())));
    }

}
