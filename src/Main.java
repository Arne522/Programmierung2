//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PopcornPopper popcornPopper = new PopcornPopper();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer("");
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popcornPopper,theaterLights,screen,projector,amplifier,dvdPlayer);
        homeTheaterFacade.watchMovie("Star Wars");
        System.out.println();
        homeTheaterFacade.endMovie();

    }
}