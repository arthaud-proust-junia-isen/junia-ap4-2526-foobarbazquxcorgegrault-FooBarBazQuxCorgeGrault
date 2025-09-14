package com.jad;

import java.util.ArrayList;

public class Foo {
    private Bar bar;
    private ArrayList<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private ArrayList<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.qux = new Qux();
        this.graults = new ArrayList<>();
    }

    public Bar getBar() {
        return this.bar;
    }

    public ArrayList<Baz> getBazs() {
        return this.bazs;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public Qux getQux() {
        return this.qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        if(this.corge != null) {
            this.corge.setFoo(null);
        }
        this.corge = corge;
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }

    public ArrayList<Grault> getGraults() {
        return this.graults;
    }
}
