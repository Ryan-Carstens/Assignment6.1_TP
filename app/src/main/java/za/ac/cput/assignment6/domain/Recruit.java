package za.ac.cput.assignment6.domain;

/**
 * Created by Ryan Carstens 213133040.
 */
public class Recruit implements UserInterface {
    private Long id;
    private String southAfricanID;
    private String firstName;
    private String lastName;


    public Long getId() {
        return id;
    }

    public String getSouthAfricanID() {
        return southAfricanID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private Recruit()
    {

    }

    private Recruit(Builder builder) {
        this.id = builder.id;
        this.southAfricanID = builder.southAfricanID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class Builder{
        private Long id;
        private String southAfricanID;
        private String firstName;
        private String lastName;

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder southAfricanID(String value){
            this.southAfricanID = value;
            return this;
        }

        public Builder firstName(String value){
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }

        public Builder copy(Recruit value) {
            this.id = value.id;
            this.southAfricanID = value.southAfricanID;
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            return this;
        }

        public Recruit build() {
            return new Recruit(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recruit recruit = (Recruit) o;

        return id != null ? id.equals(recruit.id) : recruit.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}