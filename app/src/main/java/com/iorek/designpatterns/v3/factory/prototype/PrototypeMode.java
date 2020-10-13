package com.iorek.designpatterns.v3.factory.prototype;

public class PrototypeMode implements Cloneable {
    private String name;
    private PersonMode personMode;

    public PersonMode getPersonMode() {
        return personMode;
    }

    public void setPersonMode(PersonMode personMode) {
        this.personMode = personMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrototypeMode selfClone(){
        PrototypeMode mode = new PrototypeMode();
        mode.setName(this.name);
        return mode;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeMode mode = new PrototypeMode();
        mode.setName(this.name);
        PersonMode personMode1 = (PersonMode) this.personMode.clone();
        mode.setPersonMode(personMode1);
        return mode;
        //return super.clone();
    }
}
