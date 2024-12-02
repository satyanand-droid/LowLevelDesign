package org.example.movieticketbooking;

public class Movie {
    String name;
    int runtime;

    public Movie(String name, int runtime) {
        this.name = name;
        this.runtime = runtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
