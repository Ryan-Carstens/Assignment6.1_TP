package za.ac.cput.assignment6.domain;

/**
 * Created by Ryan Carstens 213133040.
 */
public class RegistryManager implements UserInterface {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String southAfricanID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private RegistryManager()
    {

    }

    private RegistryManager(Builder builder) {
        this.id = builder.id;
        this.southAfricanID = builder.southAfricanID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static class Builder{
        private Long id;
        private String southAfricanID;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

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

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder copy(RegistryManager value) {
            this.id = value.id;
            this.southAfricanID = value.southAfricanID;
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            this.email = value.email;
            this.password = value.password;
            return this;
        }

        public RegistryManager build() {
            return new RegistryManager(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegistryManager registryManager = (RegistryManager) o;

        return id != null ? id.equals(registryManager.id) : registryManager.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
