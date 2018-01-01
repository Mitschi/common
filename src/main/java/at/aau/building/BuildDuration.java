package at.aau.building;

public  class BuildDuration {
    private int minutes=0,seconds=0,rest=0;

    public BuildDuration(int minutes, int seconds, int rest) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.rest = rest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildDuration duration = (BuildDuration) o;

        if (minutes != duration.minutes) return false;
        if (seconds != duration.seconds) return false;
        return rest == duration.rest;

    }

    @Override
    public int hashCode() {
        int result = minutes;
        result = 31 * result + seconds;
        result = 31 * result + rest;
        return result;
    }

    @Override
    public String toString() {
        return "Duration{" +
                "minutes=" + minutes +
                ", seconds=" + seconds +
                ", rest=" + rest +
                '}';
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }
}