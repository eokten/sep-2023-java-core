package org.okten.javacore.product;

public enum Status {

    ACTIVE("Активний"),
    DISCARDED("Відхилено"),
    NON_PRESENT("Закінчився");

    private String label;

    Status(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
