public class HomeTheaterFacade {
    PopcornPopper popper;
    TheaterLights lights;
    Screen screen;
    Projector projector;
    Amplifier amp;
    DvdPlayer dvd;

    public HomeTheaterFacade(PopcornPopper popper, TheaterLights lights, Screen screen, Projector projector, Amplifier amp, DvdPlayer dvd) {
        this.popper = popper;
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
        this.amp = amp;
        this.dvd = dvd;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        popper.off();
        lights.on();
        dvd.stop();
        dvd.eject();
        dvd.off();
        amp.off();
        projector.off();
        screen.up();
    }
}
