/**
 * <h2>Programming Object Oriented II: Gauge</h2>
 *
 * <p>
 * This package introduces the concept of returning values from methods and controlling internal state through method logic.
 * The {@code Gauge} class models a bounded counter that can be increased and decreased within a fixed range.
 * </p>
 *
 * <h3>Key learning goals:</h3>
 * <ul>
 *   <li><b>Encapsulation</b>: The field {@code value} is private, and all modifications are handled through methods.</li>
 *   <li><b>State control</b>: The {@code increase()} and {@code decrease()} methods ensure the value stays within the bounds [0, 5].</li>
 *   <li><b>Returning values</b>: The {@code value()} and {@code full()} methods allow read-only access to internal state.</li>
 * </ul>
 *
 * <p>
 * This exercise helps students understand how to implement class behavior that protects internal state
 * while exposing controlled access through accessor methods and logic.
 * </p>
 *
 * <p>
 * <img src="../../../../resources/GaugeUML.png" alt="Gauge UML Diagram" width="300" height="300"/>
 * </p>
 */
package main.java.progOO2.p12;
