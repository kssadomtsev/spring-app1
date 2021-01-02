package ru.onyxone;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    private RockMusic() {
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    public void doInit() {
        System.out.println("Doing initialization");
    }

    public void doDestroy() {
        System.out.println("Doing destruction");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
