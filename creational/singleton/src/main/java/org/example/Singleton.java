package org.example;

/**
 * Singleton class.
 *
 * <p>In this implementation, the constructor of the Singleton class is private, which means that it cannot be called from outside the class.
 * The only way to create an instance of the Singleton class is through the public static final field INSTANCE, which is initialized with a single instance of the Singleton class.
 * By making INSTANCE a static field, it can be accessed from anywhere in the code using the class name, without the need to create an instance of the Singleton class.
 * The use of the final keyword ensures that the INSTANCE field cannot be reassigned once it has been initialized, making it a true singleton.</p>
 *
 * @author mDyingSTar
 */
public final class Singleton {

  public static final Singleton INSTANCE = new Singleton();

  private Singleton() {
  }
}
