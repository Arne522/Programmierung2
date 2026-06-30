import java.security.Timestamp;

import static java.util.Objects.isNull;

public class bspNegativ2 {
    Muskelentspannung ermittleErstenNachfolger(Timestamp pDatumUhrzeit, StatusMuskelentspannung pStatus )
    {
        Zahnpasta lZP = getZahnpasta();
        if( lZP != null )
        {
            Container<Muskelentspannung> lMuskelentspannungen = lZP.getMuskelentspannungen();

            for( Muskelentspannung lME : lMuskelentspannungen )
            {
                if( pStatus != null )
                {
                    if( !hatStatus( pStatus ) )
                    {
                        continue;
                    }
                }

                Timestamp datumUhrzeit = lME.getDatumUhrzeit();
                if( !TimestampImpl.isNull( datumUhrzeit ) && TimestampImpl.after( datumUhrzeit, pDatumUhrzeit ) )
                {
                    return lME;
                }
            }
        }

        return null;
    }

    public static boolean after(Timestamp pTimestamp1, Timestamp pTimestamp2) {
        if (!isNull(pTimestamp1) && !isNull(pTimestamp2)) {
            return pTimestamp1.getTimestamp() > pTimestamp2.getTimestamp();
        } else {
            return false;
        }
    }
}
