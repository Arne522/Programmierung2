public class bspNegativ3 {
    private final boolean istVonBriefumschlag( String schluessel )
    {
        if( schluessel.isEmpty() ) {
            return false;
        }
            if( !schluessel.startsWith( "#" ) ) {
                return true;
            }
                BerechtigungFactory lBerechtigungFactory = GlobalService.getBerechtigungFactory();
                Berechtigung lBerechtigungAdressenAnlegen = Berechtigung.get( GlobalService._BERECHTIGUNG_ANLEGEN_NICHT_OFFIZIELLER_ADRESSEN_VOM_ADRESSSERVER );

                return lBerechtigungFactory.istAktuellerBenutzerBerechtigt( lBerechtigungAdressenAnlegen );


    }
}
