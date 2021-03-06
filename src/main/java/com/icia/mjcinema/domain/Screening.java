package com.icia.mjcinema.domain;


import com.icia.mjcinema.domain.objects.bjh.ch02.Reservation;

import java.time.LocalDateTime;

public class Screening {
    private final String location;

    private final Movie movie;
    private final int sequence;
    private final LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened , String location) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
        this.location = location;
    }

    public LocalDateTime getStartTime(){
        return whenScreened;
    }

    public boolean isSequence(int sequence){
        return this.sequence == sequence;
    }

    public String getMovieFee(){
        return movie.getFee();
    }

    public Reservation reserve(User user, int audienceCount) {
        return new Reservation(user, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this)
                .times(audienceCount);
    }


    public String getLocation() {
        return location;
    }
}
