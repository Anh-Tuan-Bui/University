public abstract class Vehicle {
  protected String brand;
  protected String model;
  protected String registrationNumber;
  protected Person owner;

  /**Initialize vehicle default. */
  public Vehicle(String brand, String model, String registrationNumber, Person owner) {
    this.brand = brand;
    this.model = model;
    this.registrationNumber = registrationNumber;
    this.owner = owner;
  }

  /**Getter info. */
  public abstract String getInfo();

  /**Transfer owner ship. */
  public void transferOwnership(Person newOwner) {
    this.owner = newOwner;
  }

  /**Getter brand. */
  public String getBrand() {
    return brand;
  }

  /**Setter brand. */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**Getter model. */
  public String getModel() {
    return model;
  }

  /**Setter model. */
  public void setModel(String model) {
    this.model = model;
  }

  /**Getter registrationNumber. */
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  /**Setter registrationNumber.*/
  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  /**Getter owner. */
  public Person getOwner() {
    return owner;
  }

  /**Setter owner. */
  public void setOwner(Person owner) {
    this.owner = owner;
  }
}
